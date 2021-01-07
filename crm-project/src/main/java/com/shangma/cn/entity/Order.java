package com.shangma.cn.entity;

import java.util.Date;

public class Order {
    private Long id;

    private String orderType;

    private Long goodId;

    private String businessType;

    private String orderMotion;

    private String orderMode;

    private String orderPay;

    private Long orderState;

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

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    public String getOrderMotion() {
        return orderMotion;
    }

    public void setOrderMotion(String orderMotion) {
        this.orderMotion = orderMotion == null ? null : orderMotion.trim();
    }

    public String getOrderMode() {
        return orderMode;
    }

    public void setOrderMode(String orderMode) {
        this.orderMode = orderMode == null ? null : orderMode.trim();
    }

    public String getOrderPay() {
        return orderPay;
    }

    public void setOrderPay(String orderPay) {
        this.orderPay = orderPay == null ? null : orderPay.trim();
    }

    public Long getOrderState() {
        return orderState;
    }

    public void setOrderState(Long orderState) {
        this.orderState = orderState;
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