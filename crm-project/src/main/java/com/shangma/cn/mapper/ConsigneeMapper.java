package com.shangma.cn.mapper;

import com.shangma.cn.entity.Consignee;
import com.shangma.cn.entity.ConsigneeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConsigneeMapper{
    long countByExample(ConsigneeExample example);

    int deleteByExample(ConsigneeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Consignee record);

    int insertSelective(Consignee record);

    List<Consignee> selectByExample(ConsigneeExample example);

    Consignee selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Consignee record, @Param("example") ConsigneeExample example);

    int updateByExample(@Param("record") Consignee record, @Param("example") ConsigneeExample example);

    int updateByPrimaryKeySelective(Consignee record);

    int updateByPrimaryKey(Consignee record);
}