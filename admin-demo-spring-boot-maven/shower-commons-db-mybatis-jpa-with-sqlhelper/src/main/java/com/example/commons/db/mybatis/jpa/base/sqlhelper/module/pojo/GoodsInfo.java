package com.example.commons.db.mybatis.jpa.base.sqlhelper.module.pojo;

import com.example.commons.db.mybatis.jpa.base.sqlhelper.commons.pojo.CommonsEntity;
import lombok.*;

import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;

/**
    * goods_info
    */
@Data
@EqualsAndHashCode(callSuper=true)
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
}