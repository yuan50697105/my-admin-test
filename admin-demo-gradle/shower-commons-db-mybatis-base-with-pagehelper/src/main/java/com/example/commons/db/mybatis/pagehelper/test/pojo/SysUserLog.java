package com.example.commons.db.mybatis.pagehelper.test.pojo;

import lombok.*;

import java.io.Serializable;

/**
 * sys_user_log
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysUserLog extends CommonsEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 账户
     */
    private String username;
    /**
     * 姓名
     */
    private String name;
    /**
     * 密码
     */
    private String password;
    /**
     * 操作
     */
    private String operation;
    /**
     * 描述
     */
    private String decription;
    /**
     * 请求路径
     */
    private String url;
    /**
     * 参数
     */
    private String params;

    public static SysUserLogBuilder builder() {
        return new SysUserLogBuilder();
    }
}