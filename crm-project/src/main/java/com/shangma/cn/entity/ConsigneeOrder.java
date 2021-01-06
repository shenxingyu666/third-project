package com.shangma.cn.entity;

import com.shangma.cn.entity.base.BaseEntity;
import lombok.Data;


@Data
public class ConsigneeOrder extends BaseEntity {

    private Long orderId;

    private Long goodId;

    private Double goodPrice;

    private Long goodNumber;

    private Double goodMoney;

}