package com.example.commons.db.mybatis.mapper.ext.pagehelper.test.pojo;

import com.example.commons.db.mybatis.mapper.ext.pagehelper.commons.pojo.CommonsEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
    * sys_user
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sys_user")
public class SysUser extends CommonsEntity implements Serializable {
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

    private static final long serialVersionUID = 1L;
}