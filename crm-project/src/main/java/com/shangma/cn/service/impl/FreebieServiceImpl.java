package com.shangma.cn.service.impl;

import com.github.pagehelper.PageInfo;
import com.shangma.cn.dto.FreebieDto;
import com.shangma.cn.entity.Freebie;
import com.shangma.cn.entity.FreebieExample;
import com.shangma.cn.entity.Good;
import com.shangma.cn.entity.GoodExample;
import com.shangma.cn.mapper.FreebieMapper;
import com.shangma.cn.service.FreebieService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
@Transactional
public class FreebieServiceImpl extends BaseServiceImpl<Freebie> implements FreebieService {

    @Autowired
    private FreebieMapper freebieMapper;

    @Override
    public PageVo<Freebie> findFreebie(FreebieDto freebieDto) {

        FreebieExample freebieExample=new FreebieExample();
        FreebieExample.Criteria criteria = freebieExample.createCriteria();

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
        List<Freebie> freebies = freebieMapper.selectByExample(freebieExample);
        PageInfo<Freebie> pageInfo = new PageInfo<>(freebies);
        long total = pageInfo.getTotal();
        PageVo<Freebie> pageVo = new PageVo<>();
        pageVo.setList(freebies);
        pageVo.setTotal(total);
        return pageVo;


    }
}
