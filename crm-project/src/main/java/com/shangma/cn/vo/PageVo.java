package com.shangma.cn.vo;

import lombok.Data;

import java.util.List;



public class PageVo<T> {

    private long total;

    private List<T> list;

    public PageVo() {
    }

    public PageVo(long total, List<T> list) {
        this.total = total;
        this.list = list;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
