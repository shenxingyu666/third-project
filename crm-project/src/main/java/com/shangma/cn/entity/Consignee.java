package com.shangma.cn.entity;

import com.shangma.cn.entity.base.BaseEntity;

import java.util.Date;

public class Consignee extends BaseEntity {

    private String consigneeName;

    private String consigneePhone;

    private String consigneeCell;

    private String consigneeSite;

    private String consigneeRemarks;

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName == null ? null : consigneeName.trim();
    }

    public String getConsigneePhone() {
        return consigneePhone;
    }

    public void setConsigneePhone(String consigneePhone) {
        this.consigneePhone = consigneePhone == null ? null : consigneePhone.trim();
    }

    public String getConsigneeCell() {
        return consigneeCell;
    }

    public void setConsigneeCell(String consigneeCell) {
        this.consigneeCell = consigneeCell == null ? null : consigneeCell.trim();
    }

    public String getConsigneeSite() {
        return consigneeSite;
    }

    public void setConsigneeSite(String consigneeSite) {
        this.consigneeSite = consigneeSite == null ? null : consigneeSite.trim();
    }

    public String getConsigneeRemarks() {
        return consigneeRemarks;
    }

    public void setConsigneeRemarks(String consigneeRemarks) {
        this.consigneeRemarks = consigneeRemarks == null ? null : consigneeRemarks.trim();
    }
}