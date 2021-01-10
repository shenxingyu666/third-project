package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.dto.AddPhoneInOrderDto;
import com.shangma.cn.dto.RetrunFactoryOrderDto;
import com.shangma.cn.dto.ReturnOrderSearchDto;
import com.shangma.cn.entity.ReturnFactoryOrder;
import com.shangma.cn.entity.ReturnFactoryOrderExample;
import com.shangma.cn.model.UniqueGood;
import com.shangma.cn.service.ReturnFactoryOrderService;
import com.shangma.cn.vo.PageVo;
import com.shangma.cn.vo.ReturnOrderDetail;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.List;

@RestController
@RequestMapping("aftersale")
public class SaleServiceController extends BaseController {
    @Autowired
    private ReturnFactoryOrderService returnFactoryOrderService;

    /**
     * 返厂出库列表
     *
     * @return
     */
    @PostMapping("getOutOrder")
    public AxiosResult<PageVo<ReturnFactoryOrder>> getOutOrder(@RequestBody ReturnOrderSearchDto searchDto) {
        PageHelper.startPage((int) searchDto.getCurrentPage().longValue(), (int) searchDto.getPageSize().longValue());
        ReturnFactoryOrderExample orderExample = getExample(searchDto);
        orderExample.createCriteria().andOrderStatusEqualTo("返厂出库单");
        PageVo<ReturnFactoryOrder> all = returnFactoryOrderService.findAll(orderExample);
        return AxiosResult.success(all);
    }

    public ReturnFactoryOrderExample getExample(ReturnOrderSearchDto searchDto) {
        ReturnFactoryOrderExample orderExample = new ReturnFactoryOrderExample();
        ReturnFactoryOrderExample.Criteria criteria = orderExample.createCriteria();
        if (searchDto.getOrderId() != null) {
            criteria.andIdEqualTo(searchDto.getOrderId());
        }
        if (!StringUtils.isEmpty(searchDto.getIoStatus())) {
            criteria.andIoStatusEqualTo(searchDto.getIoStatus());
        }
        if (!StringUtils.isEmpty(searchDto.getApprovalStatus())) {
            criteria.andApprovalStatusEqualTo(searchDto.getApprovalStatus());
        }
        if (searchDto.getCreatorId() != null) {
            criteria.andCreatorIdEqualTo(searchDto.getCreatorId());
        }
        if (searchDto.getAddTime1() != null && searchDto.getAddTime2() != null) {
            criteria.andAddTimeBetween(searchDto.getAddTime1(), searchDto.getAddTime2());
        }
        if (searchDto.getAddTime1() != null && searchDto.getAddTime2() == null) {
            criteria.andAddTimeGreaterThan(searchDto.getAddTime1());
        }

        if (searchDto.getApprovalTime1() != null && searchDto.getApprovalTime2() != null) {
            criteria.andUpdateTimeBetween(searchDto.getApprovalTime1(), searchDto.getApprovalTime2()).andApprovalStatusNotEqualTo("未审核");
        }
        if (searchDto.getApprovalTime1() != null && searchDto.getApprovalTime2() == null) {
            criteria.andUpdateTimeGreaterThan(searchDto.getApprovalTime1()).andApprovalStatusNotEqualTo("未审核");
        }
        return orderExample;
    }

    /**
     * 返厂出库单详情
     *
     * @param orderId
     * @return
     */
    @GetMapping("getOutOrderDetail/{orderId}")
    public AxiosResult<ReturnOrderDetail> getOutOrderDetail(@PathVariable Long orderId) {
        ReturnFactoryOrder returnFactoryOrder = returnFactoryOrderService.findById(orderId);
        List<UniqueGood> uniqueGoods = returnFactoryOrderService.returnOrderDetail(orderId);
        return AxiosResult.success(new ReturnOrderDetail(returnFactoryOrder, uniqueGoods));
    }

    /**
     * 添加返厂出库单
     *
     * @param order
     * @return
     */
    @PostMapping("addOutOrderDetail")
    public AxiosResult<Void> addOutOrderDetail(@RequestBody RetrunFactoryOrderDto order) {
        int i = 0;
        try {
            i = returnFactoryOrderService.addOrder(order);
        } catch (Exception e) {
            return toAxios(0);
        }
        return toAxios(i);
    }

    /**
     * 删除一张返厂出库单中的手机
     *
     * @param id 手机串号
     * @return
     */
    @DeleteMapping("removePhonefromOrder/{id}")
    public AxiosResult<Void> removePhonefromOrder(@PathVariable Long id) {
        return toAxios(returnFactoryOrderService.deletePhoneInOrder(id));
    }

    /**
     * 往一张返厂出库单中添加手机
     *
     * @return
     */
    @PostMapping("pushPhoneInOrder")
    public AxiosResult<Void> pushPhoneInOrder(@RequestBody AddPhoneInOrderDto phoneAndOrderId) {
        int i = 0;
        try {
            i = returnFactoryOrderService.pushPhoneInOrder(phoneAndOrderId);
        } catch (Exception e) {
            return toAxios(0);
        }
        return toAxios(i);
    }

    /**
     * 删除订单
     */
    @DeleteMapping("deleteOrder/{ids}")
    public AxiosResult<Void> deleteOrder(@PathVariable List<Long> ids) {
        return toAxios(returnFactoryOrderService.batchDeleteOrder(ids));
    }

    /**
     * 修改order
     *
     * @param order
     * @return
     */
    @PutMapping("updateOutOrderDetail")
    public AxiosResult<Void> updateOutOrderDetail(@RequestBody RetrunFactoryOrderDto order) {
        int i = 0;
        try {
            i = returnFactoryOrderService.updateOrder(order);
        } catch (Exception e) {
            return toAxios(0);
        }
        return toAxios(i);
    }

    /**
     * 导出
     */
    @GetMapping("export")
    public ResponseEntity<byte[]> export(@RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize) throws IOException {
        PageHelper.startPage(currentPage,pageSize);
        List<ReturnFactoryOrder> allEmployee = returnFactoryOrderService.getAll();
        //创建工作簿
        Workbook workbook = new SXSSFWorkbook();
        Sheet employeeList = workbook.createSheet("出库单列表");
        //创建行若干
        for (int i = 0; i < allEmployee.size(); i++) {
            Row row = employeeList.createRow(i);
            //创建单元格
            row.createCell(0).setCellValue(allEmployee.get(i).getId());
            row.createCell(1).setCellValue(allEmployee.get(i).getIoStatus());
            row.createCell(2).setCellValue(allEmployee.get(i).getFactoryAddress());
            row.createCell(3).setCellValue(allEmployee.get(i).getOrderStatus());
            row.createCell(4).setCellValue(allEmployee.get(i).getAddTime());
            row.createCell(5).setCellValue(String.valueOf(allEmployee.get(i).getApprovalStatus()));
            row.createCell(4).setCellValue(allEmployee.get(i).getFixReason());
        }

        ByteArrayOutputStream memory = new ByteArrayOutputStream();
        //工作簿写入内存中
        workbook.write(memory);
        workbook.close();
        //把内存中的流转成字节数组
        byte[] bytes = memory.toByteArray();

        //让浏览器解析为 员工列表.xlsx
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentDispositionFormData("attachment", URLEncoder.encode("出库单列表.xlsx", "utf-8"));
        ResponseEntity responseEntity = new ResponseEntity(bytes, httpHeaders, HttpStatus.OK);

        memory.close();
        return responseEntity;
    }
}
