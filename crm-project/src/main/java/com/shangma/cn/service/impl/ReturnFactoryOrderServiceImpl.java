package com.shangma.cn.service.impl;

import com.shangma.cn.common.utils.ReflectionUtils;
import com.shangma.cn.dto.AddPhoneInOrderDto;
import com.shangma.cn.dto.RetrunFactoryOrderDto;
import com.shangma.cn.entity.*;
import com.shangma.cn.mapper.FaultphoneFactoryMapper;
import com.shangma.cn.mapper.GoodMapper;
import com.shangma.cn.mapper.StorePhoneMapper;
import com.shangma.cn.model.UniqueGood;
import com.shangma.cn.service.ReturnFactoryOrderService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
@Slf4j
public class ReturnFactoryOrderServiceImpl extends BaseServiceImpl<ReturnFactoryOrder> implements ReturnFactoryOrderService {
    @Autowired
    private FaultphoneFactoryMapper faultphoneFactoryMapper;
    @Autowired
    private StorePhoneMapper storePhoneMapper;
    @Autowired
    private GoodMapper goodMapper;

    /**
     * 根据单号查询单据
     * @param orderId
     * @return
     */
    @Override
    public List<UniqueGood> returnOrderDetail(Long orderId){
        FaultphoneFactoryExample example = new FaultphoneFactoryExample();
        example.createCriteria().andRetrunOrderIdEqualTo(orderId);
        List<FaultphoneFactory> list = faultphoneFactoryMapper.selectByExample(example);
        List<UniqueGood> uniqueGoods = new ArrayList<>(8);

        list.forEach(i->{
            StorePhone storePhone = storePhoneMapper.selectByPrimaryKey(i.getGoodUniqueId());
            UniqueGood uniqueGood = new UniqueGood();
            uniqueGood.setStatusDesc(storePhone.getStatusDesc());
            Long goodId = storePhone.getGoodId();
            Good good = goodMapper.selectByPrimaryKey(goodId);
            if(good != null){
                good.setId(storePhone.getGoodUniqueId());
                BeanUtils.copyProperties(good,uniqueGood);
            }
            uniqueGoods.add(uniqueGood);
        });
        return uniqueGoods;
    }

    /**
     * 添加返厂出库单
     * @param order
     * @return
     */
    @Override
    public int addOrder(RetrunFactoryOrderDto order) {

        try {
            ReturnFactoryOrder returnFactoryOrder = getObject(ReturnFactoryOrder.class,order);
            this.addEntity(returnFactoryOrder);
            List<StorePhone> list = order.getList();
            list.forEach(i->{
                storePhoneMapper.insert(i);
                faultphoneFactoryMapper.insert(new FaultphoneFactory(i.getGoodUniqueId(),returnFactoryOrder.getId()));
            });
            return 1;
        } catch (Exception e) {
            log.error(e.getMessage());
            return 0;
        }

    }

    /**
     * deletePhoneInOrder
     * @param id
     * @return
     */
    @Override
    public int deletePhoneInOrder(Long id) {
        try {
            FaultphoneFactoryExample example = new FaultphoneFactoryExample();
            example.createCriteria().andGoodUniqueIdEqualTo(id);
            faultphoneFactoryMapper.deleteByExample(example);
            return 1;
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return 0;
    }

    /**
     * pushPhoneInOrder
     * @param phoneAndOrderId
     * @return
     */
    @Override
    public int pushPhoneInOrder(AddPhoneInOrderDto phoneAndOrderId) {
        try {
            FaultphoneFactory object = getObject(FaultphoneFactory.class, phoneAndOrderId);
            System.out.println(object);
            faultphoneFactoryMapper.insert(object);
            storePhoneMapper.insert(getObject(StorePhone.class, phoneAndOrderId));
            return 1;
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return 0;
    }

    /**
     * 三个表更新
     * @param order
     * @return
     */
    @Override
    public int updateOrder(RetrunFactoryOrderDto order) {
        try {
            this.updateEntity(getObject(ReturnFactoryOrder.class,order));
            List<StorePhone> list = order.getList();
            list.forEach(i->{
                storePhoneMapper.updateByPrimaryKey(i);
            });
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * 根据单号删除单据
     * @param orderIds
     * @return
     */
    @Override
    public int batchDeleteOrder(List<Long> orderIds) {
        orderIds.forEach(i->{
            FaultphoneFactoryExample example = new FaultphoneFactoryExample();
            example.createCriteria().andRetrunOrderIdEqualTo(i);
            faultphoneFactoryMapper.deleteByExample(example);
            this.deleteById(i);
        });
        return 1;
    }

    public <T> T getObject(Class<T> t, Object obj) throws Exception{
        T t1 = t.newInstance();
        BeanUtils.copyProperties(obj,t1);
        ReflectionUtils.myInvokeMethod(t1,"setOrderStatus",String.class,"返厂出库单");
        ReflectionUtils.myInvokeMethod(t1,"setIoStatus",String.class,"未出库");
        return t1;
    }

}
