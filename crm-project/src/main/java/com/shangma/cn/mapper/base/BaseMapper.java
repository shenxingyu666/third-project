package com.shangma.cn.mapper.base;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface BaseMapper<T> {

    long countByExample(Object example);

    int deleteByExample(Object example);

    int deleteByPrimaryKey(Long id);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExample(Object example);

    T selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") T record, @Param("example") Object example);

    int updateByExample(@Param("record") T record, @Param("example") Object example);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
