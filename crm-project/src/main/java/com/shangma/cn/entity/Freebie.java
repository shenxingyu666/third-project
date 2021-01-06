package com.shangma.cn.entity;

import com.shangma.cn.entity.base.BaseEntity;
import lombok.Data;

import java.util.Date;

@Data
public class Freebie extends BaseEntity {

    private String freebieName;

    private Long freebieCategoryId;

    private Long freebieBrandId;

    private String freebieModelNum;

    private Long freebieSupplierId;

    private String freebieDesc;

    private String freebieColor;

    private Double freebiePrice;

    private Integer freebieNum;

}