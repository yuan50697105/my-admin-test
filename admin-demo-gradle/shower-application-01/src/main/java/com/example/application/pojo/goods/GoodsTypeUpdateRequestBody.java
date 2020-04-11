package com.example.application.pojo.goods;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-11 13:37
 */
@Data
public class GoodsTypeUpdateRequestBody {
    /**
     * 主键
     */
    @NotNull
    private Long id;
    /**
     * 编号
     */
    @NotBlank
    private String code;

    /**
     * 名称
     */
    @NotBlank
    private String name;
}