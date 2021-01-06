package com.shangma.cn.mapper;

import com.shangma.cn.entity.ConsigneeOrder;
import com.shangma.cn.entity.ConsigneeOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConsigneeOrderMapper {
    long countByExample(ConsigneeOrderExample example);

    int deleteByExample(ConsigneeOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConsigneeOrder record);

    int insertSelective(ConsigneeOrder record);

    List<ConsigneeOrder> selectByExample(ConsigneeOrderExample example);

    ConsigneeOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConsigneeOrder record, @Param("example") ConsigneeOrderExample example);

    int updateByExample(@Param("record") ConsigneeOrder record, @Param("example") ConsigneeOrderExample example);

    int updateByPrimaryKeySelective(ConsigneeOrder record);

    int updateByPrimaryKey(ConsigneeOrder record);
}