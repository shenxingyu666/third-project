package com.shangma.cn.service.impl;

import com.shangma.cn.entity.Freebie;
import com.shangma.cn.entity.Good;
import com.shangma.cn.entity.GoodToFreebie;
import com.shangma.cn.mapper.FreebieMapper;
import com.shangma.cn.mapper.GoodMapper;
import com.shangma.cn.mapper.GoodToFreebieMapper;
import com.shangma.cn.service.GoodToFreebieService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class GoodToFreebieServiceImpl extends BaseServiceImpl<GoodToFreebie> implements GoodToFreebieService {

    @Autowired
    private GoodMapper goodMapper;

    @Autowired
    private GoodToFreebieMapper goodToFreebieMapper;

    @Autowired
    private FreebieMapper freebieMapper;


    @Override
    public int goodChange(Long goodId) {

        Good good = goodMapper.selectByPrimaryKey(goodId);

        GoodToFreebie goodToFreebie =new GoodToFreebie();
        goodToFreebie.setGoodId(goodId);
        goodToFreebie.setGoodName(good.getGoodName());
        goodToFreebie.setGoodCategoryId(good.getGoodCategoryId());
        goodToFreebie.setGoodBrandId(good.getGoodBrandId());
        goodToFreebie.setGoodModelNum(good.getGoodModelNum());
        goodToFreebie.setGoodSupplierId(good.getGoodSupplierId());
        goodToFreebie.setGoodDesc(good.getGoodDesc());
        goodToFreebie.setGoodColor(good.getGoodColor());
        goodToFreebie.setGoodPrice(good.getGoodPrice());
        goodToFreebie.setGoodNum(good.getGoodNum());

        Freebie freebie=new Freebie();
        freebie.setFreebieName(good.getGoodName());
        freebie.setFreebieCategoryId(good.getGoodCategoryId());
        freebie.setFreebieBrandId(good.getGoodBrandId());
        freebie.setFreebieModelNum(good.getGoodModelNum());
        freebie.setFreebieSupplierId(good.getGoodSupplierId());
        freebie.setFreebieDesc(good.getGoodDesc());
        freebie.setFreebieColor(good.getGoodColor());
        freebie.setFreebiePrice(good.getGoodPrice());
        freebie.setFreebieNum(good.getGoodNum());

        int insert = goodToFreebieMapper.insert(goodToFreebie);
        int insert1 = freebieMapper.insert(freebie);
        int i = goodMapper.deleteByPrimaryKey(goodId);


        return insert+insert1+i;
    }
}
