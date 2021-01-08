package com.shangma.cn.dto;

import com.shangma.cn.entity.StorePhone;
import lombok.Data;

import java.util.List;

@Data
public class RetrunFactoryOrderDto {
    private Long Id;
    private String factoryAddress;
    private String fixReason;
    private String otherDesc;
    List<StorePhone> list;

}
