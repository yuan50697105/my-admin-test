package org.yuan.adminbase.modules.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.adminbase.commons.entity.BaseEntity;

/**
 * @program: admin-base
 * @description: 系统用户
 * @author: yuane
 * @create: 2020-04-24 22:48
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysUser extends BaseEntity {
    /**
     * 用户名
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
}