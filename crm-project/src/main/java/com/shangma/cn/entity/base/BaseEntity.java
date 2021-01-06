package com.shangma.cn.entity.base;

import lombok.Data;

import java.util.Date;


@Data
public class BaseEntity {
    private Long id;

    private Date addTime;

    private Long creatorId;

    private Date updateTime;

    private Long updateId;


    public void setData() {
        if (id == null) {
            this.creatorId = 1L;
            this.addTime = new Date();
        } else {
            this.updateId = 2L;
            this.updateTime = new Date();
        }
    }

}
