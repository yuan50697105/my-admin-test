package com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo;

import com.example.commons.db.mybatis.jpa.base.pagehelper.commons.pojo.CommonsEntity;
import lombok.*;

import javax.persistence.Entity;
import java.io.Serializable;

/**
    * sys_user
    */
@Data
@EqualsAndHashCode(callSuper=true)
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
}