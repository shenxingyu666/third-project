package com.shangma.cn.entity;

import java.util.Date;

public class Freebie {
    private Long id;

    private String freebieName;

    private Long freebieCategoryId;

    private Long freebieBrandId;

    private String freebieModelNum;

    private Long freebieSupplierId;

    private String freebieDesc;

    private String freebieColor;

    private Double freebiePrice;

    private Integer freebieNum;

    private Long creatorId;

    private Date creatorTime;

    private Long updateId;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFreebieName() {
        return freebieName;
    }

    public void setFreebieName(String freebieName) {
        this.freebieName = freebieName == null ? null : freebieName.trim();
    }

    public Long getFreebieCategoryId() {
        return freebieCategoryId;
    }

    public void setFreebieCategoryId(Long freebieCategoryId) {
        this.freebieCategoryId = freebieCategoryId;
    }

    public Long getFreebieBrandId() {
        return freebieBrandId;
    }

    public void setFreebieBrandId(Long freebieBrandId) {
        this.freebieBrandId = freebieBrandId;
    }

    public String getFreebieModelNum() {
        return freebieModelNum;
    }

    public void setFreebieModelNum(String freebieModelNum) {
        this.freebieModelNum = freebieModelNum == null ? null : freebieModelNum.trim();
    }

    public Long getFreebieSupplierId() {
        return freebieSupplierId;
    }

    public void setFreebieSupplierId(Long freebieSupplierId) {
        this.freebieSupplierId = freebieSupplierId;
    }

    public String getFreebieDesc() {
        return freebieDesc;
    }

    public void setFreebieDesc(String freebieDesc) {
        this.freebieDesc = freebieDesc == null ? null : freebieDesc.trim();
    }

    public String getFreebieColor() {
        return freebieColor;
    }

    public void setFreebieColor(String freebieColor) {
        this.freebieColor = freebieColor == null ? null : freebieColor.trim();
    }

    public Double getFreebiePrice() {
        return freebiePrice;
    }

    public void setFreebiePrice(Double freebiePrice) {
        this.freebiePrice = freebiePrice;
    }

    public Integer getFreebieNum() {
        return freebieNum;
    }

    public void setFreebieNum(Integer freebieNum) {
        this.freebieNum = freebieNum;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreatorTime() {
        return creatorTime;
    }

    public void setCreatorTime(Date creatorTime) {
        this.creatorTime = creatorTime;
    }

    public Long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}