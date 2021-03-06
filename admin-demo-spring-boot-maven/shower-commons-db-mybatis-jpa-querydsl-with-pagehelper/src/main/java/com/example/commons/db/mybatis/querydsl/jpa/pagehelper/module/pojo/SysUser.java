package com.example.commons.db.mybatis.querydsl.jpa.pagehelper.module.pojo;

import com.example.commons.db.mybatis.querydsl.jpa.pagehelper.commons.pojo.CommonsEntity;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

/**
 * sys_user
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
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