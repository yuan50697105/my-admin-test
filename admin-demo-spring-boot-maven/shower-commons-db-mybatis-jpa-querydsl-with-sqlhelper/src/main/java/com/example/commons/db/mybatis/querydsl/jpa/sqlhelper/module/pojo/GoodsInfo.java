package com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.pojo;

import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.commons.pojo.CommonsEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

/**
 * goods_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class GoodsInfo extends CommonsEntity implements Serializable {
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