package com.example.application.goods.pojo.type;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-11 13:37
 */
@Data
public class GoodsTypeSaveRequestBody {
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