package com.shangma.cn.entity.base;

import lombok.Data;

import java.util.Date;

/**
 * 开发者：辉哥
 * 特点： 辉哥很帅
 * 开发时间：2021/1/4 17:44
 * 文件说明：
 */
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
