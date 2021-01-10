package com.shangma.cn.service.impl;

import com.github.pagehelper.PageInfo;
import com.shangma.cn.dto.GoodDTO;
import com.shangma.cn.entity.Good;
import com.shangma.cn.entity.GoodExample;
import com.shangma.cn.mapper.GoodMapper;
import com.shangma.cn.service.GoodService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
@Transactional
public class GoodServiceImpl extends BaseServiceImpl<Good> implements GoodService {

    @Autowired
    private GoodMapper goodMapper;

    @Override
    public PageVo<Good> findGood(GoodDTO goodDTO) {

        GoodExample goodExample =new GoodExample();
        GoodExample.Criteria criteria = goodExample.createCriteria();

        if(!StringUtils.isEmpty(goodDTO.getGoodName())){
            criteria.andGoodNameEqualTo(goodDTO.getGoodName());
        }

        if(!StringUtils.isEmpty(goodDTO.getGoodModelNum())){
            criteria.andGoodModelNumEqualTo(goodDTO.getGoodModelNum());
        }

        if(!StringUtils.isEmpty(goodDTO.getGoodBrandId())){
            criteria.andGoodBrandIdEqualTo(goodDTO.getGoodBrandId());
        }

        if(!StringUtils.isEmpty(goodDTO.getGoodCategoryId())){
            criteria.andGoodCategoryIdEqualTo(goodDTO.getGoodCategoryId());
        }
        List<Good> goods = goodMapper.selectByExample(goodExample);
        PageInfo<Good> pageInfo = new PageInfo<>(goods);
        long total = pageInfo.getTotal();
        PageVo<Good> pageVo = new PageVo<>();
        pageVo.setList(goods);
        pageVo.setTotal(total);

        return pageVo;
    }
}
