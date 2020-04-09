package com.example.commons.db.mybatis.ext.pagehelper.test.pojo;

import java.io.Serializable;

import com.example.commons.db.mybatis.ext.pagehelper.commons.pojo.CommonsEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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