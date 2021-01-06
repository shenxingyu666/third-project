package com.shangma.cn.entity;

import java.util.Date;

public class Good {
    private Long id;

    private String goodName;

    private Long goodCategoryId;

    private Long goodBrandId;

    private String goodModelNum;

    private Long goodSupplierId;

    private String goodDesc;

    private String goodColor;

    private Double goodPrice;

    private Integer goodNum;

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

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    public Long getGoodCategoryId() {
        return goodCategoryId;
    }

    public void setGoodCategoryId(Long goodCategoryId) {
        this.goodCategoryId = goodCategoryId;
    }

    public Long getGoodBrandId() {
        return goodBrandId;
    }

    public void setGoodBrandId(Long goodBrandId) {
        this.goodBrandId = goodBrandId;
    }

    public String getGoodModelNum() {
        return goodModelNum;
    }

    public void setGoodModelNum(String goodModelNum) {
        this.goodModelNum = goodModelNum == null ? null : goodModelNum.trim();
    }

    public Long getGoodSupplierId() {
        return goodSupplierId;
    }

    public void setGoodSupplierId(Long goodSupplierId) {
        this.goodSupplierId = goodSupplierId;
    }

    public String getGoodDesc() {
        return goodDesc;
    }

    public void setGoodDesc(String goodDesc) {
        this.goodDesc = goodDesc == null ? null : goodDesc.trim();
    }

    public String getGoodColor() {
        return goodColor;
    }

    public void setGoodColor(String goodColor) {
        this.goodColor = goodColor == null ? null : goodColor.trim();
    }

    public Double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(Double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public Integer getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(Integer goodNum) {
        this.goodNum = goodNum;
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