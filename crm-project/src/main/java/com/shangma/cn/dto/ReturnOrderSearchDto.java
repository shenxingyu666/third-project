package com.shangma.cn.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ReturnOrderSearchDto {
    private Long orderId;
    private String ioStatus;
    private String approvalStatus;
    private Long creatorId;
    private Date addTime1;
    private Date addTime2;
    private Date approvalTime1;
    private Date approvalTime2;
    private Long currentPage;
    private Long pageSize;
}
