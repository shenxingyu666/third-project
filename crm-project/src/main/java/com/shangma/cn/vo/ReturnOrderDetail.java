package com.shangma.cn.vo;

import com.shangma.cn.entity.Good;
import com.shangma.cn.entity.ReturnFactoryOrder;
import com.shangma.cn.model.UniqueGood;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 返厂出库详情页
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnOrderDetail {
    private ReturnFactoryOrder order;
    private List<UniqueGood> list;
}
