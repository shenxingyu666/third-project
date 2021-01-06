package com.shangma.cn.entity;

import com.shangma.cn.entity.base.BaseEntity;
import lombok.Data;


@Data
public class Brand extends BaseEntity {
    private String name;

    private String brandSite;

    private String brandDesc;

    private String brandLogo;

}