package com.example.commons.db.mybatis.pagehelper.test.pojo;

import java.io.Serializable;

import com.example.commons.db.mybatis.pagehelper.commons.pojo.CommonsEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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