package com.shangma.cn.entity;

import java.util.Date;

public class Order {
    private Long id;

    private Long orderTypeId;

    private String orderTypeName;

    private Long goodId;

    private Long consigneeorderId;

    private String orderMotion;

    private Long consigneeId;

    private String businessType;

    private String orderMode;

    private Long orderPayId;

    private String orderPayName;

    private Long orderState;

    private String orderStateName;

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

    public Long getOrderTypeId() {
        return orderTypeId;
    }

    public void setOrderTypeId(Long orderTypeId) {
        this.orderTypeId = orderTypeId;
    }

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    public Long getConsigneeorderId() {
        return consigneeorderId;
    }

    public void setConsigneeorderId(Long consigneeorderId) {
        this.consigneeorderId = consigneeorderId;
    }

    public String getOrderMotion() {
        return orderMotion;
    }

    public void setOrderMotion(String orderMotion) {
        this.orderMotion = orderMotion == null ? null : orderMotion.trim();
    }

    public Long getConsigneeId() {
        return consigneeId;
    }

    public void setConsigneeId(Long consigneeId) {
        this.consigneeId = consigneeId;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    public String getOrderMode() {
        return orderMode;
    }

    public void setOrderMode(String orderMode) {
        this.orderMode = orderMode == null ? null : orderMode.trim();
    }

    public Long getOrderPayId() {
        return orderPayId;
    }

    public void setOrderPayId(Long orderPayId) {
        this.orderPayId = orderPayId;
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

    public String getOrderTypeName() {
        return orderTypeName;
    }

    public void setOrderTypeName(String orderTypeName) {
        this.orderTypeName = orderTypeName;
    }

    public String getOrderPayName() {
        return orderPayName;
    }

    public void setOrderPayName(String orderPayName) {
        this.orderPayName = orderPayName;
    }

    public String getOrderStateName() {
        return orderStateName;
    }

    public void setOrderStateName(String orderStateName) {
        this.orderStateName = orderStateName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderTypeId=" + orderTypeId +
                ", orderTypeName='" + orderTypeName + '\'' +
                ", goodId=" + goodId +
                ", consigneeorderId=" + consigneeorderId +
                ", orderMotion='" + orderMotion + '\'' +
                ", consigneeId=" + consigneeId +
                ", businessType='" + businessType + '\'' +
                ", orderMode='" + orderMode + '\'' +
                ", orderPayId=" + orderPayId +
                ", orderPayName='" + orderPayName + '\'' +
                ", orderState=" + orderState +
                ", orderStateName='" + orderStateName + '\'' +
                ", addTime=" + addTime +
                ", creatorId=" + creatorId +
                ", updateTime=" + updateTime +
                ", updateEmpid=" + updateEmpid +
                '}';
    }
}