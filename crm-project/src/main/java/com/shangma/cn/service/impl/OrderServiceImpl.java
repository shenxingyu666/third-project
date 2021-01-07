package com.shangma.cn.service.impl;

import com.shangma.cn.entity.Order;
import com.shangma.cn.service.OrderService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderServiceImpl extends BaseServiceImpl<Order> implements OrderService {
}
