package com.shangma.cn.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ReturnFactoryOrder {
    private Long id;

    private String orderStatus;

    private String factoryAddress;

    private String fixReason;

    private String ioStatus;

    private String otherDesc;

    private String approvalStatus;

    private String approvalName;

    private String approvalStatement;

    private Date addTime;

    private Date updateTime;

    private Long creatorId;

    private Long updateEmpid;

    public void setData() {
        if (id == null) {
            this.creatorId = 1L;
            this.addTime = new Date();
        } else {
            this.updateEmpid = 2L;
            this.updateTime = new Date();
        }
    }

}
