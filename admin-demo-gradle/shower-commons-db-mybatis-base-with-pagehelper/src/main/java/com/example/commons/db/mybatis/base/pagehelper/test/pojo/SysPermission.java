package com.example.commons.db.mybatis.base.pagehelper.test.pojo;

import com.example.commons.db.mybatis.base.pagehelper.commons.pojo.CommonsEntity;
import com.example.commons.db.mybatis.base.pagehelper.test.constants.EnableConstants;
import com.example.commons.db.mybatis.base.pagehelper.test.constants.PermissionConstants;
import lombok.*;

import java.io.Serializable;

/**
 * sys_permission
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysPermission extends CommonsEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 权限名称
     */
    private String name;
    /**
     * 全新编号
     */
    private String code;
    /**
     * 类型 {@link PermissionConstants}
     */
    private String type;
    /**
     * 启用状态 {@link EnableConstants}
     */
    private String enabled;

    public static SysPermissionBuilder builder() {
        return new SysPermissionBuilder();
    }
}