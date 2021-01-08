package com.shangma.cn.service;

import com.shangma.cn.dto.AddPhoneInOrderDto;
import com.shangma.cn.dto.RetrunFactoryOrderDto;
import com.shangma.cn.entity.ReturnFactoryOrder;
import com.shangma.cn.model.UniqueGood;
import com.shangma.cn.service.base.BaseService;

import java.util.List;

public interface ReturnFactoryOrderService extends BaseService<ReturnFactoryOrder> {
    List<UniqueGood> returnOrderDetail(Long orderId);

    int addOrder(RetrunFactoryOrderDto order);

    int deletePhoneInOrder(Long id);

    int pushPhoneInOrder(AddPhoneInOrderDto phoneAndOrderId);

    int updateOrder(RetrunFactoryOrderDto order);

    int batchDeleteOrder(List<Long> orderIds);
}
