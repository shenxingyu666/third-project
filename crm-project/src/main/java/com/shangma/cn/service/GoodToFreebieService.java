package com.shangma.cn.service;

import com.shangma.cn.dto.FreebieDto;
import com.shangma.cn.entity.GoodToFreebie;
import com.shangma.cn.service.base.BaseService;
import com.shangma.cn.vo.PageVo;

public interface GoodToFreebieService extends BaseService<GoodToFreebie> {

    int goodChange(Long goodId);

    PageVo<GoodToFreebie> find(FreebieDto freebieDto);
}
