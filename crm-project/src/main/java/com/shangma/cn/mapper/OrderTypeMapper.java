package com.shangma.cn.mapper;

import com.shangma.cn.entity.OrderType;
import com.shangma.cn.entity.OrderTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderTypeMapper {
    long countByExample(OrderTypeExample example);

    int deleteByExample(OrderTypeExample example);

    int deleteByPrimaryKey(Long typeId);

    int insert(OrderType record);

    int insertSelective(OrderType record);

    List<OrderType> selectByExample(OrderTypeExample example);

    OrderType selectByPrimaryKey(Long typeId);

    int updateByExampleSelective(@Param("record") OrderType record, @Param("example") OrderTypeExample example);

    int updateByExample(@Param("record") OrderType record, @Param("example") OrderTypeExample example);

    int updateByPrimaryKeySelective(OrderType record);

    int updateByPrimaryKey(OrderType record);
}