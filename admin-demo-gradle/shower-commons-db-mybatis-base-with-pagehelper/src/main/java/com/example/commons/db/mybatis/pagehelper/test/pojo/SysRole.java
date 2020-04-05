package com.example.commons.db.mybatis.pagehelper.test.pojo;

import lombok.*;

import java.io.Serializable;

/**
 * sys_role
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysRole extends CommonsDbEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 角色编号
     */
    private String code;
    /**
     * 角色名称
     */
    private String name;
    /**
     * 启用状态 {@link com.example.commons.db.mybatis.pagehelper.test.constants.EnableConstants}
     */
    private String enabled;
}