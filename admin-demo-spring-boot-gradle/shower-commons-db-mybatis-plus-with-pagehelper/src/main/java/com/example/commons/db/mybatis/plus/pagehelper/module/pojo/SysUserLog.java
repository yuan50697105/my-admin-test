package com.example.commons.db.mybatis.plus.pagehelper.module.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.commons.db.mybatis.plus.pagehelper.commons.pojo.CommonsEntity;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * sys_user_log
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_user_log")
public class SysUserLog extends CommonsEntity implements Serializable {
    /**
     * 账户
     */
    @TableField(value = "username")
    private String username;

    /**
     * 姓名
     */
    @TableField(value = "name")
    private String name;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 操作
     */
    @TableField(value = "operation")
    private String operation;

    /**
     * 描述
     */
    @TableField(value = "decription")
    private String decription;

    /**
     * 请求路径
     */
    @TableField(value = "url")
    private String url;

    /**
     * 参数
     */
    @TableField(value = "params")
    private String params;

    private static final long serialVersionUID = 1L;

    public static SysUserLogBuilder builder() {
        return new SysUserLogBuilder();
    }
}