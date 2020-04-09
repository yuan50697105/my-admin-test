package com.example.commons.db.mybatis.base.pagehelper.test.pojo;

import com.example.commons.db.mybatis.base.pagehelper.commons.pojo.CommonsEntity;
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

    private static final long serialVersionUID = 1L;

    public static SysUserBuilder builder() {
        return new SysUserBuilder();
    }
}