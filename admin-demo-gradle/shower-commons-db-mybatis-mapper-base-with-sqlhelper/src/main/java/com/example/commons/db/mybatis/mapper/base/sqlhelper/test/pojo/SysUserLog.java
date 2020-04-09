package com.example.commons.db.mybatis.mapper.base.sqlhelper.test.pojo;

import com.example.commons.db.mybatis.mapper.base.sqlhelper.commons.pojo.CommonsEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * sys_user_log
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sys_user_log")
public class SysUserLog extends CommonsEntity implements Serializable {
    /**
     * 账户
     */
    @Column(name = "username")
    private String username;

    /**
     * 姓名
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 密码
     */
    @Column(name = "`password`")
    private String password;

    /**
     * 操作
     */
    @Column(name = "`operation`")
    private String operation;

    /**
     * 描述
     */
    @Column(name = "decription")
    private String decription;

    /**
     * 请求路径
     */
    @Column(name = "url")
    private String url;

    /**
     * 参数
     */
    @Column(name = "params")
    private String params;

    private static final long serialVersionUID = 1L;

    public static SysUserLogBuilder builder() {
        return new SysUserLogBuilder();
    }
}