package com.shangma.cn.service.base;

import com.shangma.cn.mapper.base.BaseMapper;
import com.shangma.cn.vo.PageVo;

import java.util.List;


public interface BaseService<T> {


    PageVo<T> findAll();

    PageVo<T> findAll(Object example);

    T findById(Long id);

    int addEntity(T entity);

    int updateEntity(T entity);

    int deleteById(Long id);

    int batchDeleteByIds(List<Long> ids);

    PageVo<T> setPage(List<T> list);

    public BaseMapper<T> getBaseMapper();

    int updateEntityByPrimaryKeySelective(T entity);
}
