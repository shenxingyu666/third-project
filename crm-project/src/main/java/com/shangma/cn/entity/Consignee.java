package com.shangma.cn.entity;

import com.shangma.cn.entity.base.BaseEntity;
import lombok.Data;

@Data
public class Consignee extends BaseEntity {

    private String consigneeName;

    private String consigneePhone;

    private String consigneeCell;

    private String consigneeSite;

    private String consigneeRemarks;

}