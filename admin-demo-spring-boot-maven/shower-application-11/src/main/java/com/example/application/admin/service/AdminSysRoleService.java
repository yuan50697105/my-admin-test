package com.example.application.admin.service;

import com.example.application.admin.pojo.role.AdminSysPermissionUpdateRequestBody;
import com.example.application.admin.pojo.role.AdminSysRoleSaveRequestBody;
import com.example.application.admin.pojo.role.AdminSysRoleUpdateRequestBody;
import com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.query.SysRoleQuery;
import com.example.commons.web.base.pojo.Result;

import java.util.List;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 14:43
 */
public interface AdminSysRoleService {
    /**
     * 保存
     *
     * @param requestBody 请求实体
     * @return 处理结果
     */
    Result save(AdminSysRoleSaveRequestBody requestBody);

    /**
     * 修改
     *
     * @param requestBody 请求实体
     * @return 处理结果
     */
    Result updateInfo(AdminSysRoleUpdateRequestBody requestBody);

    /**
     * 修改角色权限
     * @param requestBody 请求实体
     * @return 处理结果
     */
    Result updatePermission(AdminSysPermissionUpdateRequestBody requestBody);

    /**
     * 删除
     *
     * @param id 主键
     * @return 处理结果
     */
    Result delete(Long id);

    /**
     * 删除
     *
     * @param ids 主键列表
     * @return 处理结果
     */
    Result delete(List<Long> ids);

    /**
     * 主键查询
     *
     * @param id 主键
     * @return 角色
     */
    Result get(Long id);

    /**
     * 分页表格
     *
     * @param query 查询条件
     * @return 分页数据
     */
    Result data(SysRoleQuery query);

    /**
     * 列表查询
     *
     * @param query 查询条件
     * @return 数据列表
     */
    Result list(SysRoleQuery query);
}
