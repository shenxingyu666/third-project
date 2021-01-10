package com.shangma.cn.service;

import com.shangma.cn.dto.AddPhoneInOrderDto;
import com.shangma.cn.dto.RetrunFactoryOrderDto;
import com.shangma.cn.entity.ReturnFactoryOrder;
import com.shangma.cn.model.UniqueGood;
import com.shangma.cn.service.base.BaseService;

import java.util.List;

public interface ReturnFactoryOrderService extends BaseService<ReturnFactoryOrder> {
    List<UniqueGood> returnOrderDetail(Long orderId);

    int addOrder(RetrunFactoryOrderDto order) throws Exception;

    int deletePhoneInOrder(Long id);

    int pushPhoneInOrder(AddPhoneInOrderDto phoneAndOrderId) throws Exception;

    int updateOrder(RetrunFactoryOrderDto order) throws Exception;

    int batchDeleteOrder(List<Long> orderIds);

    List<ReturnFactoryOrder> getAll();
}
