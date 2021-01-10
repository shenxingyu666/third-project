package com.shangma.cn.dto;

import com.shangma.cn.entity.StorePhone;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class RetrunFactoryOrderDto {
    private Long Id;
    private String factoryAddress;
    private String fixReason;
    private String otherDesc;
    //private Date addTime;
    List<StorePhone> list;
    private String approvalStatus;
    private String approvalName;
    private String approvalStatement;

}
