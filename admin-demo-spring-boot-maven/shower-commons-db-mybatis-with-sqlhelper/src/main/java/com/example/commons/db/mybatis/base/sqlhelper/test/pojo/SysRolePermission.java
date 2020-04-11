package com.example.commons.db.mybatis.base.sqlhelper.test.pojo;

import com.example.commons.db.mybatis.base.sqlhelper.commons.pojo.CommonsEntity;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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