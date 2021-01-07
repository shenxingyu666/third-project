package com.shangma.cn.service.impl;

import com.shangma.cn.entity.Freebie;
import com.shangma.cn.service.FreebieService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FreebieServiceImpl extends BaseServiceImpl<Freebie> implements FreebieService {
}
