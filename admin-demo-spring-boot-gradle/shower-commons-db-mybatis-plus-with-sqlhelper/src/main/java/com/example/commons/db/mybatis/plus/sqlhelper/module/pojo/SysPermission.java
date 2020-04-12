package com.example.commons.db.mybatis.plus.sqlhelper.module.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.commons.db.mybatis.plus.sqlhelper.commons.pojo.CommonsEntity;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
    * sys_permission
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_permission")
public class SysPermission extends CommonsEntity implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

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
}