package com.shangma.cn.entity;

import com.shangma.cn.entity.base.BaseEntity;
import lombok.Data;


@Data
public class Order extends BaseEntity {

    private String orderType;

    private Long goodId;

    private String businessType;

    private String orderMotion;

    private String orderMode;

    private String orderPay;

    private Long orderState;

}