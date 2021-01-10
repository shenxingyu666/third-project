package com.shangma.cn.service;


import com.shangma.cn.dto.FreebieDto;
import com.shangma.cn.entity.FreebieToGood;
import com.shangma.cn.service.base.BaseService;
import com.shangma.cn.vo.PageVo;

public interface FreebieToGoodService extends BaseService<FreebieToGood> {
    int freebieChange(Long freebieId);

    PageVo<FreebieToGood> find(FreebieDto freebieDto);
}
