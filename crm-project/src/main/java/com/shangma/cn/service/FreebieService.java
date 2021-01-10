package com.shangma.cn.service;

import com.shangma.cn.dto.FreebieDto;
import com.shangma.cn.entity.Freebie;
import com.shangma.cn.service.base.BaseService;
import com.shangma.cn.vo.PageVo;

public interface FreebieService extends BaseService<Freebie> {
    PageVo<Freebie> findFreebie(FreebieDto freebieDto);
}
