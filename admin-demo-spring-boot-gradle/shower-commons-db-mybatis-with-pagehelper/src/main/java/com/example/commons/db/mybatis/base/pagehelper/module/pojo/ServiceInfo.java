package com.example.commons.db.mybatis.base.pagehelper.module.pojo;

import com.example.commons.db.mybatis.base.pagehelper.commons.pojo.CommonsEntity;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * service_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ServiceInfo extends CommonsEntity implements Serializable {
    /**
     * 类型ID
     */
    private Long typeId;

    /**
     * 编号
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 价格
     */
    private BigDecimal price;

    private static final long serialVersionUID = 1L;

}