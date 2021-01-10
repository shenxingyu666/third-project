package com.shangma.cn.service;

import com.shangma.cn.entity.Consignee;
import com.shangma.cn.service.base.BaseService;

import java.util.List;

public interface ConsigneeService extends BaseService<Consignee> {

    List<Consignee> findQuery(long id);
}
