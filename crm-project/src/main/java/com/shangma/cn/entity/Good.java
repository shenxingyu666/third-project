package com.shangma.cn.entity;

import com.shangma.cn.entity.base.BaseEntity;
import lombok.Data;

import java.util.Date;

@Data
public class Good extends BaseEntity {


    private String goodName;

    private Long goodCategoryId;

    private Long goodBrandId;

    private String goodModelNum;

    private Long goodSupplierId;

    private String goodDesc;

    private String goodColor;

    private Double goodPrice;

    private Integer goodNum;

}