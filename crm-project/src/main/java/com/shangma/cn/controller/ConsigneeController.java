package com.shangma.cn.controller;

import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.mapper.OrderMapper;
import com.shangma.cn.service.ConsigneeService;
import com.shangma.cn.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consignee")
public class ConsigneeController {

    @Autowired
    private ConsigneeService consigneeService;
    @GetMapping("{id}")
    private AxiosResult findQuery(@PathVariable long id){
        return AxiosResult.success(consigneeService.findQuery(id));
    }


}
