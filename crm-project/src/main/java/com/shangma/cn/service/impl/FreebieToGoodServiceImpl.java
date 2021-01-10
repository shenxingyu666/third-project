package com.shangma.cn.service.impl;

import com.github.pagehelper.PageInfo;
import com.shangma.cn.dto.FreebieDto;
import com.shangma.cn.entity.Freebie;
import com.shangma.cn.entity.FreebieToGood;
import com.shangma.cn.entity.FreebieToGoodExample;
import com.shangma.cn.entity.Good;
import com.shangma.cn.mapper.FreebieMapper;
import com.shangma.cn.mapper.FreebieToGoodMapper;
import com.shangma.cn.mapper.GoodMapper;
import com.shangma.cn.service.FreebieToGoodService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
@Transactional
public class FreebieToGoodServiceImpl extends BaseServiceImpl<FreebieToGood> implements FreebieToGoodService {

    @Autowired
    private FreebieMapper freebieMapper;

    @Autowired
    private FreebieToGoodMapper freebieToGoodMapper;

    @Autowired
    private GoodMapper goodMapper;


    @Override
    public int freebieChange(Long freebieId) {

        Freebie freebie = freebieMapper.selectByPrimaryKey(freebieId);

        FreebieToGood freebieToGood =new FreebieToGood();
        freebieToGood.setFreebieId(freebie.getId());
        freebieToGood.setFreebieName(freebie.getFreebieName());
        freebieToGood.setFreebieCategoryId(freebie.getFreebieCategoryId());
        freebieToGood.setFreebieBrandId(freebie.getFreebieBrandId());
        freebieToGood.setFreebieModelNum(freebie.getFreebieModelNum());
        freebieToGood.setFreebieSupplierId(freebie.getFreebieSupplierId());
        freebieToGood.setFreebieDesc(freebie.getFreebieDesc());
        freebieToGood.setFreebieColor(freebie.getFreebieColor());
        freebieToGood.setFreebiePrice(freebie.getFreebiePrice());
        freebieToGood.setFreebieNum(freebie.getFreebieNum());

        Good good=new Good();

        good.setGoodName(freebie.getFreebieName());
        good.setGoodCategoryId(freebie.getFreebieCategoryId());
        good.setGoodBrandId(freebie.getFreebieBrandId());
        good.setGoodModelNum(freebie.getFreebieModelNum());
        good.setGoodSupplierId(freebie.getFreebieSupplierId());
        good.setGoodDesc(freebie.getFreebieDesc());
        good.setGoodColor(freebie.getFreebieColor());
        good.setGoodPrice(freebie.getFreebiePrice());
        good.setGoodNum(freebie.getFreebieNum());

        int insert = freebieToGoodMapper.insert(freebieToGood);
        int insert1 = goodMapper.insert(good);
        int i = freebieMapper.deleteByPrimaryKey(freebieId);


        return insert+insert1+i;
    }

    @Override
    public PageVo<FreebieToGood> find(FreebieDto freebieDto) {

        FreebieToGoodExample freebieToGoodExample=new FreebieToGoodExample();
        FreebieToGoodExample.Criteria criteria = freebieToGoodExample.createCriteria();

        if(!StringUtils.isEmpty(freebieDto.getFreebieName())){
            criteria.andFreebieNameEqualTo(freebieDto.getFreebieName());
        }

        if(!StringUtils.isEmpty(freebieDto.getFreebieModelNum())){
            criteria.andFreebieModelNumEqualTo(freebieDto.getFreebieModelNum());
        }

        if(!StringUtils.isEmpty(freebieDto.getFreebieBrandId())){
            criteria.andFreebieBrandIdEqualTo(freebieDto.getFreebieBrandId());
        }

        if(!StringUtils.isEmpty(freebieDto.getFreebieCategoryId())){
            criteria.andFreebieCategoryIdEqualTo(freebieDto.getFreebieCategoryId());
        }

        List<FreebieToGood> freebieToGoods = freebieToGoodMapper.selectByExample(freebieToGoodExample);
        PageInfo<FreebieToGood> pageInfo=new PageInfo<>(freebieToGoods);
        long total = pageInfo.getTotal();

        PageVo<FreebieToGood> pageVo=new PageVo<>();
        pageVo.setTotal(total);
        pageVo.setList(freebieToGoods);

        return pageVo;


    }
}
