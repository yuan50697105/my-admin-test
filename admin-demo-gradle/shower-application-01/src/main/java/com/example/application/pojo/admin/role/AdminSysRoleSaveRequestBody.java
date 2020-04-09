package com.example.application.pojo.admin.role;

import com.example.commons.pojo.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 角色保存实体
 *
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 14:43
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AdminSysRoleSaveRequestBody extends BaseEntity {
    /**
     * 角色编号
     */
    private String code;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 启用状态 {@link com.example.commons.db.mybatis.base.pagehelper.test.constants.EnableConstants}
     */
    private String enabled;
}