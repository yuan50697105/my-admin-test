package com.example.commons.db.mybatis.base.sqlhelper.module.pojo;

import com.example.commons.db.mybatis.base.sqlhelper.commons.pojo.CommonsEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
    * goods_order_item
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GoodsOrderItem extends CommonsEntity implements Serializable {
    /**
    * 订单ID
    */
    private Long orderId;

    /**
    * 订单号
    */
    private String orderNo;

    /**
    * 商品ID
    */
    private Long goodsId;

    /**
    * 商品编号
    */
    private String goodsCode;

    /**
    * 商品名称
    */
    private String goodsName;

    /**
    * 数量
    */
    private Integer num;

    /**
    * 价格
    */
    private BigDecimal price;

    private static final long serialVersionUID = 1L;
}