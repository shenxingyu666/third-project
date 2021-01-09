package com.shangma.cn.entity;

import java.util.Date;

public class ConsigneeOrder {
    private Long id;

    private Long orderId;

    private String goodName;

    private Long goodId;

    private Double goodPrice;

    private Long goodNumber;

    private Double goodMoney;

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

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    public Double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(Double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public Long getGoodNumber() {
        return goodNumber;
    }

    public void setGoodNumber(Long goodNumber) {
        this.goodNumber = goodNumber;
    }

    public Double getGoodMoney() {
        return goodMoney;
    }

    public void setGoodMoney(Double goodMoney) {
        this.goodMoney = goodMoney;
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