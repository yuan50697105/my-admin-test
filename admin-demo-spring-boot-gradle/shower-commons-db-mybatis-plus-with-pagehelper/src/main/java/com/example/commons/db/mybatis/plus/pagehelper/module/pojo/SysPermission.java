package com.example.commons.db.mybatis.plus.pagehelper.module.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.commons.db.mybatis.plus.pagehelper.commons.pojo.CommonsEntity;
import java.io.Serializable;
import java.util.Date;
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
@TableName(value = "sys_permission")
public class SysPermission extends CommonsEntity implements Serializable {
    /**
     * 权限名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 全新编号
     */
    @TableField(value = "code")
    private String code;

    /**
     * 类型 {@link PermissionConstants}
     */
    @TableField(value = "type")
    private String type;

    /**
     * 启用状态 {@link EnableConstants}
     */
    @TableField(value = "enabled")
    private String enabled;

    private static final long serialVersionUID = 1L;

    public static SysPermissionBuilder builder() {
        return new SysPermissionBuilder();
    }
}