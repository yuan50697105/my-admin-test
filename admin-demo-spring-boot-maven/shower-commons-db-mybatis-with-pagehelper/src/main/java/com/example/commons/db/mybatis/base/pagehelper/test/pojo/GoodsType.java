package com.example.commons.db.mybatis.base.pagehelper.test.pojo;

import com.example.commons.db.mybatis.base.pagehelper.commons.pojo.CommonsEntity;
import lombok.*;

import java.io.Serializable;

/**
 * goods_type
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GoodsType extends CommonsEntity implements Serializable {
    /**
     * 编号
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    private static final long serialVersionUID = 1L;
}