package com.shangma.cn.service.impl;

import com.shangma.cn.entity.Brand;
import com.shangma.cn.entity.FaultphoneFactory;
import com.shangma.cn.service.BrandService;
import com.shangma.cn.service.FaultphoneFactoryService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class FaultphoneFactoryServiceImpl extends BaseServiceImpl<FaultphoneFactory> implements FaultphoneFactoryService {

}
