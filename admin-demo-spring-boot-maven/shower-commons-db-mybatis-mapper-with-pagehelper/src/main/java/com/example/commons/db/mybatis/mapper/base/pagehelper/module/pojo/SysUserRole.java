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
 * sys_user_role
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sys_user_role")
public class SysUserRole extends CommonsEntity implements Serializable {
    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 角色ID
     */
    @Column(name = "role_id")
    private Long roleId;

    private static final long serialVersionUID = 1L;

    public static SysUserRoleBuilder builder() {
        return new SysUserRoleBuilder();
    }
}