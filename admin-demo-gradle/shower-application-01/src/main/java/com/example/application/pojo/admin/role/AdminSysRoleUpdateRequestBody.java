package com.example.application.pojo.admin.role;

import com.example.commons.pojo.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 角色修改实体
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 14:45
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AdminSysRoleUpdateRequestBody extends BaseEntity {
    /**
     * 主键
     */
    private Long id;
    /**
     * 角色名称
     */
    private String name;
}