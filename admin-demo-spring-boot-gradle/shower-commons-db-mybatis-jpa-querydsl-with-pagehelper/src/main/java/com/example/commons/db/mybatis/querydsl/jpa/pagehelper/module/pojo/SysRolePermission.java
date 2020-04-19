package com.example.commons.db.mybatis.querydsl.jpa.pagehelper.module.pojo;

import com.example.commons.db.mybatis.querydsl.jpa.pagehelper.commons.pojo.CommonsEntity;
import lombok.*;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * sys_role_permission
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
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