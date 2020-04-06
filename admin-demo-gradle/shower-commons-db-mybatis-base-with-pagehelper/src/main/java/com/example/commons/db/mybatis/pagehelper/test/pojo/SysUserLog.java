package com.example.commons.db.mybatis.pagehelper.test.pojo;

import com.example.commons.db.mybatis.ext.sqlhelper.test.pojo.CommonsDbEntity;
import java.io.Serializable;
import java.util.Date;
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
public class SysUserLog extends CommonsDbEntity implements Serializable {
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

    private static final long serialVersionUID = 1L;

    public static SysUserLogBuilder builder() {
        return new SysUserLogBuilder();
    }
}