package com.shangma.cn.service;


import com.shangma.cn.entity.FreebieToGood;
import com.shangma.cn.service.base.BaseService;

public interface FreebieToGoodService extends BaseService<FreebieToGood> {
    int freebieChange(Long freebieId);
}
