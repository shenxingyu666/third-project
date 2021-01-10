package com.shangma.cn.service;

import com.shangma.cn.dto.GoodDTO;
import com.shangma.cn.entity.Good;
import com.shangma.cn.service.base.BaseService;
import com.shangma.cn.vo.PageVo;


public interface GoodService extends BaseService<Good> {
    PageVo<Good> findGood(GoodDTO goodDTO);
}
