package com.shangma.cn.service;

import com.shangma.cn.entity.ConsigneeOrder;
import com.shangma.cn.entity.Order;
import com.shangma.cn.service.base.BaseService;
import com.shangma.cn.vo.OrderVo;

import java.util.List;

public interface OrderService extends BaseService<Order> {


   List<Order> query(long id);


   List<Order> conditionQuery();

   List<Order> search(OrderVo orderVo);
}
