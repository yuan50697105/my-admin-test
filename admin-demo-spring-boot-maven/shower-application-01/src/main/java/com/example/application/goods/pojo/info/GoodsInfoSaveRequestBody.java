package com.example.application.goods.pojo.info;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-11 13:03
 */
@Data
public class GoodsInfoSaveRequestBody {
    /**
     * 类型ID
     */
    @NotNull
    private Long typeId;
    /**
     * 商品编号
     */
    @NotBlank
    private String code;

    /**
     * 商品名称
     */
    @NotBlank
    private String name;

    /**
     * 价格
     */
    @NotNull
    private BigDecimal price;

    /**
     * 库存
     */
    @NotNull
    private Integer num;
}