package com.example.application.pojo.admin.user;

import com.example.commons.pojo.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 13:47
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AdminSysUserSaveRequestBody extends BaseEntity {
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
     * 角色ID
     */
    private List<Long> roleId;
}