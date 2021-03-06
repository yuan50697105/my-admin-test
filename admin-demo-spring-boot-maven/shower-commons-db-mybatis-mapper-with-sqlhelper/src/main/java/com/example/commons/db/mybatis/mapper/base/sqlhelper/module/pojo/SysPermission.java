package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo;

import com.example.commons.db.mybatis.mapper.base.sqlhelper.commons.pojo.CommonsEntity;
import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * sys_permission
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sys_permission")
public class SysPermission extends CommonsEntity implements Serializable {
    /**
     * 权限名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 全新编号
     */
    @Column(name = "code")
    private String code;

    /**
     * 类型 {@link PermissionConstants}
     */
    @Column(name = "`type`")
    private String type;

    /**
     * 启用状态 {@link EnableConstants}
     */
    @Column(name = "enabled")
    private String enabled;

    private static final long serialVersionUID = 1L;

    public static SysPermissionBuilder builder() {
        return new SysPermissionBuilder();
    }
}