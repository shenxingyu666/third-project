package com.shangma.cn.entity;

import com.shangma.cn.entity.base.BaseEntity;
import lombok.Data;

@Data
public class Category extends BaseEntity {

    private String categoryName;

    private String categoryDesc;

    private Long parentId;

}