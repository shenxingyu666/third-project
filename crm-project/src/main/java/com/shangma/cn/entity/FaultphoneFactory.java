package com.shangma.cn.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FaultphoneFactory {
    private Long id;
    private Long retrunOrderId;
    private Long goodUniqueId;
    public FaultphoneFactory(Long goodUniqueId,Long retrunOrderId){
        this.goodUniqueId = goodUniqueId;
        this.retrunOrderId = retrunOrderId;
    }
}
