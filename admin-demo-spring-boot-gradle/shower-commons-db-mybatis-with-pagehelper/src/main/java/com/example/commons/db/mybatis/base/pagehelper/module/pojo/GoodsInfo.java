package com.example.commons.db.mybatis.base.pagehelper.module.pojo;

import com.example.commons.db.mybatis.base.pagehelper.commons.pojo.CommonsEntity;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * goods_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GoodsInfo extends CommonsEntity implements Serializable {
    /**
     * 类型ID
     */
    private Long typeId;

    /**
     * 商品编号
     */
    private String code;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 库存
     */
    private Integer num;

    private static final long serialVersionUID = 1L;

    public static GoodsInfoBuilder builder() {
        return new GoodsInfoBuilder();
    }
}