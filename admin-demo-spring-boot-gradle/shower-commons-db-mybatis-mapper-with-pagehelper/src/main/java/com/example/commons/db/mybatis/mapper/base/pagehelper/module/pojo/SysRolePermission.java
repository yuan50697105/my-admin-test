package com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo;

import com.example.commons.db.mybatis.mapper.base.pagehelper.commons.pojo.CommonsEntity;
import java.io.Serializable;
import javax.persistence.*;
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
@Table(name = "sys_role_permission")
public class SysRolePermission extends CommonsEntity implements Serializable {
    /**
     * 角色ID
     */
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 权限ID
     */
    @Column(name = "permission_id")
    private Long permissionId;

    private static final long serialVersionUID = 1L;

    public static SysRolePermissionBuilder builder() {
        return new SysRolePermissionBuilder();
    }
}