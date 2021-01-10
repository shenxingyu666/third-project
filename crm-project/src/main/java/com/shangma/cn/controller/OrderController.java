package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.entity.Order;
import com.shangma.cn.service.OrderService;
import com.shangma.cn.vo.OrderVo;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("order")
public class OrderController {


    @Autowired
    private OrderService orderService;

    @GetMapping
    public AxiosResult<PageVo<Order>> findAll(@RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<Order> all = orderService.findAll();
        return AxiosResult.success(all);
    }
    @GetMapping("{id}")
    public AxiosResult query(@PathVariable long id){
        return AxiosResult.success(orderService.query(id));
    }

    @PostMapping("conditionQuery")
    public AxiosResult conditionQuery(){
        return AxiosResult.success(orderService.conditionQuery());
    }

    @PostMapping("search")
    public AxiosResult search(@RequestBody OrderVo orderVo){
        return AxiosResult.success(orderService.search(orderVo));
    }


}
