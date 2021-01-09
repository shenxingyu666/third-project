package com.shangma.cn.service;

import com.shangma.cn.entity.GoodToFreebie;
import com.shangma.cn.service.base.BaseService;

public interface GoodToFreebieService extends BaseService<GoodToFreebie> {

    int goodChange(Long goodId);
}
