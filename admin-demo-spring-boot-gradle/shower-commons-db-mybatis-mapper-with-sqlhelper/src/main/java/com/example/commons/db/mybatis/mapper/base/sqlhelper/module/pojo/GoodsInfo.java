package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo;

import com.example.commons.db.mybatis.mapper.base.sqlhelper.commons.pojo.CommonsEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
    * goods_info
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "goods_info")
public class GoodsInfo extends CommonsEntity implements Serializable {
    /**
     * 商品编号
     */
    @Column(name = "code")
    private String code;

    /**
     * 商品名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 价格
     */
    @Column(name = "price")
    private BigDecimal price;

    /**
     * 库存
     */
    @Column(name = "num")
    private Integer num;

    private static final long serialVersionUID = 1L;
}