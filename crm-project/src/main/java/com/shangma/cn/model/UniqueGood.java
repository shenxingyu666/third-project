package com.shangma.cn.model;

import com.shangma.cn.entity.Good;
import lombok.Data;

@Data
public class UniqueGood extends Good{
    private Long goodUniqueId;
    private String statusDesc;
}
