package com.shangma.cn.entity.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;


@Data
public class BaseEntity {
    private Long id;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date addTime;

    private Long creatorId;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date updateTime;

    private Long updateEmpid;


    public void setData() {
        if (id == null) {
            this.creatorId = 1L;
            this.addTime = new Date();
        } else {
            this.updateEmpid = 2L;
            this.updateTime = new Date();
        }
    }

}
