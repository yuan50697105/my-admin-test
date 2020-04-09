package com.example.commons.db.mybatis.base.pagehelper.test.pojo;

import com.example.commons.db.mybatis.base.pagehelper.commons.pojo.CommonsEntity;
import lombok.*;

import java.io.Serializable;

/**
 * sys_role_permission
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysRolePermission extends CommonsEntity implements Serializable {
    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 权限ID
     */
    private Long permissionId;

    private static final long serialVersionUID = 1L;

    public static SysRolePermissionBuilder builder() {
        return new SysRolePermissionBuilder();
    }
}