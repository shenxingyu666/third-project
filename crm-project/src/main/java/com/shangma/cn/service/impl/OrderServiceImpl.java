package com.shangma.cn.service.impl;

import com.github.pagehelper.PageInfo;
import com.shangma.cn.entity.ConsigneeOrder;
import com.shangma.cn.entity.Order;
import com.shangma.cn.entity.OrderExample;
import com.shangma.cn.entity.OrderType;
import com.shangma.cn.mapper.ConsigneeOrderMapper;
import com.shangma.cn.mapper.OrderMapper;
import com.shangma.cn.mapper.OrderTypeMapper;
import com.shangma.cn.service.OrderService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import com.shangma.cn.vo.OrderVo;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class OrderServiceImpl extends BaseServiceImpl<Order> implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private ConsigneeOrderMapper consigneeOrderMapper;

    @Autowired
    private OrderTypeMapper orderTypeMapper;
    @Override
    public List<Order> query(long id) {
        Order order = orderMapper.selectByPrimaryKey(id);
        ConsigneeOrder consigneeOrder = consigneeOrderMapper.selectByPrimaryKey(order.getConsigneeorderId());
        List list=new ArrayList();
        list.add(consigneeOrder);
        return list;
    }


    @Override
    public List<Order> conditionQuery() {
        OrderExample orderExample=new OrderExample();
        List<Order> orders = orderMapper.selectByExample(orderExample);
        orders.forEach(order -> {
            //获取订单类型
            OrderType orderType = orderTypeMapper.selectByPrimaryKey(order.getOrderTypeId());
            order.setOrderTypeName(orderType.getTypeName());

            //获取支付方式
            OrderType orderType1 = orderTypeMapper.selectByPrimaryKey(order.getOrderPayId());
            order.setOrderPayName(orderType1.getTypeName());

            //获取订单状态
            OrderType orderType2 = orderTypeMapper.selectByPrimaryKey(order.getOrderState());
            order.setOrderStateName(orderType2.getTypeName());
        });
        return orders;
    }

    @Override
    public List<Order> search(OrderVo orderVo) {
        OrderExample orderExample=new OrderExample();

        OrderExample.Criteria criteria = orderExample.createCriteria();
        OrderExample.Criteria criteria1 = orderExample.createCriteria();
        OrderExample.Criteria criteria2 = orderExample.createCriteria();
        if(orderVo.getId()!=0){
            criteria.andIdEqualTo(orderVo.getId());
        }
        if(orderVo.getOrderTypeId()!=0){
            criteria.andOrderTypeIdEqualTo(orderVo.getOrderTypeId());
        }
        if(orderVo.getOrderPayId()!=0){
            criteria.andOrderPayIdEqualTo(orderVo.getOrderPayId());
        }
        if(!StringUtils.isEmpty(orderVo.getSearch())){
            criteria.andOrderMotionLike("%"+orderVo.getSearch()+"%");
        }

        if(orderVo.getId()!=0){
            criteria1.andIdEqualTo(orderVo.getId());
        }
        if(orderVo.getOrderTypeId()!=0){
            criteria1.andOrderTypeIdEqualTo(orderVo.getOrderTypeId());
        }
        if(orderVo.getOrderPayId()!=0){
            criteria1.andOrderPayIdEqualTo(orderVo.getOrderPayId());
        }
        if(!StringUtils.isEmpty(orderVo.getSearch())){
            criteria1.andBusinessTypeLike("%"+orderVo.getSearch()+"%");
        }

        if(orderVo.getId()!=0){
            criteria2.andIdEqualTo(orderVo.getId());
        }
        if(orderVo.getOrderTypeId()!=0){
            criteria2.andOrderTypeIdEqualTo(orderVo.getOrderTypeId());
        }
        if(orderVo.getOrderPayId()!=0){
            criteria2.andOrderPayIdEqualTo(orderVo.getOrderPayId());
        }
        if(!StringUtils.isEmpty(orderVo.getSearch())){
            criteria2.andOrderModeLike("%"+orderVo.getSearch()+"%");
        }
        orderExample.or(criteria);
        orderExample.or(criteria1);
        orderExample.or(criteria2);
        List<Order> orders = orderMapper.selectByExample(orderExample);
        orders.forEach(order -> {
            //获取订单类型
            OrderType orderType = orderTypeMapper.selectByPrimaryKey(order.getOrderTypeId());
            order.setOrderTypeName(orderType.getTypeName());

            //获取支付方式
            OrderType orderType1 = orderTypeMapper.selectByPrimaryKey(order.getOrderPayId());
            order.setOrderPayName(orderType1.getTypeName());

            //获取订单状态
            OrderType orderType2 = orderTypeMapper.selectByPrimaryKey(order.getOrderState());
            order.setOrderStateName(orderType2.getTypeName());
        });
        System.out.println(orders);
        return orders;
    }

    @Override
    public List<Order> Sales(List<Long> ids) {
        List  list=new ArrayList<>();
        ids.forEach(id->{
            Order order = orderMapper.selectByPrimaryKey(id);
            ConsigneeOrder consigneeOrder = consigneeOrderMapper.selectByPrimaryKey(order.getConsigneeId());
            list.add(consigneeOrder);
        });

        return list;
    }


}
