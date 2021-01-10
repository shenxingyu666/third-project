package com.shangma.cn.dto;

import lombok.Data;

@Data
public class AddPhoneInOrderDto {
    private Long retrunOrderId;
    private Long goodUniqueId;
    private Long goodId;
    private String statusDesc;

}

