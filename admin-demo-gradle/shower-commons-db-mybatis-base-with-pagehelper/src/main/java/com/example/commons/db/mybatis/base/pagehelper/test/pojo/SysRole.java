package com.example.commons.db.mybatis.base.pagehelper.test.pojo;

import com.example.commons.db.mybatis.base.pagehelper.commons.pojo.CommonsEntity;
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
public class SysRole extends CommonsEntity implements Serializable {
    /**
     * 角色编号
     */
    private String code;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 启用状态
     */
    private String enabled;

    private static final long serialVersionUID = 1L;

    public static SysRoleBuilder builder() {
        return new SysRoleBuilder();
    }
}