package com.example.commons.db.mybatis.base.pagehelper.module.pojo;

import com.example.commons.db.mybatis.base.pagehelper.commons.pojo.CommonsEntity;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * customer_type
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerType extends CommonsEntity implements Serializable {
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