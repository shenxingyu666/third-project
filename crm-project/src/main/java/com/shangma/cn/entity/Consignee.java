package com.shangma.cn.entity;

import java.util.Date;

public class Consignee {
    private Long id;

    private String consigneeName;

    private String consigneePhone;

    private String consigneeCell;

    private String consigneeSite;

    private String consigneeRemarks;

    private Date addTime;

    private Long creatorId;

    private Date updateTime;

    private Long updateEmpid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateEmpid() {
        return updateEmpid;
    }

    public void setUpdateEmpid(Long updateEmpid) {
        this.updateEmpid = updateEmpid;
    }
}