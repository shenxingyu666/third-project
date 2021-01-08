package com.shangma.cn.controller;

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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
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
        System.out.println(searchDto);
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
        if(searchDto.getAddTime1()!=null && searchDto.getAddTime2()!=null){
            criteria.andAddTimeBetween(searchDto.getAddTime1(), searchDto.getAddTime2());
        }
        if(searchDto.getAddTime1()!=null && searchDto.getAddTime2()==null){
            criteria.andAddTimeGreaterThan(searchDto.getAddTime1());
        }

        if(searchDto.getApprovalTime1()!=null && searchDto.getApprovalTime2()!=null){
            criteria.andUpdateTimeBetween(searchDto.getAddTime1(), searchDto.getAddTime2()).andApprovalStatusNotEqualTo("未审核");
        }
        if(searchDto.getApprovalTime1()!=null && searchDto.getApprovalTime2()==null){
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
        int i = returnFactoryOrderService.addOrder(order);
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
        return toAxios(returnFactoryOrderService.pushPhoneInOrder(phoneAndOrderId));
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
        int i = returnFactoryOrderService.updateOrder(order);
        return toAxios(i);
    }
}
