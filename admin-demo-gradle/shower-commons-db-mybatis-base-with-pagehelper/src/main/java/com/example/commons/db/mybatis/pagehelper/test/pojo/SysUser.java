package com.example.commons.db.mybatis.pagehelper.test.pojo;

import lombok.*;

import java.io.Serializable;

/**
 * sys_user
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysUser extends CommonsEntity implements Serializable {
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

    public static SysUserBuilder builder() {
        return new SysUserBuilder();
    }
}