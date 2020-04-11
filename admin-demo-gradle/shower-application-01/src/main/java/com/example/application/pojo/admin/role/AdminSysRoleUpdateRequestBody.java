package com.example.application.pojo.admin.role;

import lombok.Data;

/**
 * 角色修改实体
 *
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 14:45
 */
@Data
public class AdminSysRoleUpdateRequestBody {
    /**
     * 主键
     */
    private Long id;
    /**
     * 角色名称
     */
    private String name;
}