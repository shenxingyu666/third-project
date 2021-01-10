package com.shangma.cn.vo;

import lombok.Data;

public class OrderVo {
    private long id;

    private long orderTypeId;

    private long orderPayId;

    private String  search;

    public OrderVo() {
    }

    public OrderVo(long id, long orderTypeId, long orderPayId, String search) {
        this.id = id;
        this.orderTypeId = orderTypeId;
        this.orderPayId = orderPayId;
        this.search = search;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOrderTypeId() {
        return orderTypeId;
    }

    public void setOrderTypeId(long orderTypeId) {
        this.orderTypeId = orderTypeId;
    }

    public long getOrderPayId() {
        return orderPayId;
    }

    public void setOrderPayId(long orderPayId) {
        this.orderPayId = orderPayId;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
