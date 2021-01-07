package com.shangma.cn.mapper;

import com.shangma.cn.entity.Freebie;
import com.shangma.cn.entity.FreebieExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FreebieMapper {
    long countByExample(FreebieExample example);

    int deleteByExample(FreebieExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Freebie record);

    int insertSelective(Freebie record);

    List<Freebie> selectByExample(FreebieExample example);

    Freebie selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Freebie record, @Param("example") FreebieExample example);

    int updateByExample(@Param("record") Freebie record, @Param("example") FreebieExample example);

    int updateByPrimaryKeySelective(Freebie record);

    int updateByPrimaryKey(Freebie record);
}