package com.shangma.cn.service.impl;

import com.shangma.cn.entity.Consignee;
import com.shangma.cn.entity.Order;
import com.shangma.cn.mapper.ConsigneeMapper;
import com.shangma.cn.mapper.OrderMapper;
import com.shangma.cn.service.ConsigneeService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ConsigneeServiceImpl extends BaseServiceImpl<Consignee> implements ConsigneeService {


    @Autowired
    private ConsigneeMapper consigneeMapper;

    @Autowired
    private OrderMapper orderMapper;
    @Override
    public List<Consignee> findQuery(long id) {
        Order order = orderMapper.selectByPrimaryKey(id);
        Consignee consignee = consigneeMapper.selectByPrimaryKey(order.getConsigneeId());
        List<Consignee> list = new ArrayList<>();
        list.add(consignee);
        return list;
    }
}
