package com.example.commons.db.mybatis.pagehelper.test.pojo;

import java.io.Serializable;

import com.example.commons.db.mybatis.pagehelper.commons.pojo.CommonsEntity;
import com.example.commons.db.mybatis.pagehelper.test.constants.EnableConstants;import lombok.AllArgsConstructor;
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
public class SysPermission extends CommonsEntity implements Serializable {
    /**
     * 权限名称
     */
    private String name;

    /**
     * 全新编号
     */
    private String code;

    /**
     * 启用状态 {@link EnableConstants}
     */
    private String enabled;

    private static final long serialVersionUID = 1L;

    public static SysPermissionBuilder builder() {
        return new SysPermissionBuilder();
    }
}