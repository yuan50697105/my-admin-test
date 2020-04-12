package com.example.application.admin.service;

import com.example.application.admin.pojo.permission.AdminSysPermissionSaveRequestBody;
import com.example.application.admin.pojo.permission.AdminSysPermissionUpdateRequestBody;
import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.pojo.query.SysPermissionQuery;
import com.example.commons.web.pojo.Result;

import java.util.List;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-09 19:49
 */
public interface AdminSysPermissionService {
    /**
     * 保存权限
     *
     * @param requestBody 请求实体
     * @return 处理结果
     */
    Result save(AdminSysPermissionSaveRequestBody requestBody);

    /**
     * 修改权限
     *
     * @param requestBody 请求实体
     * @return 处理结果
     */
    Result update(AdminSysPermissionUpdateRequestBody requestBody);

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
     * @return 处理结果
     */
    Result get(Long id);

    /**
     * 分页查询
     *
     * @param query 查询条件
     * @return 处理结果
     */
    Result data(SysPermissionQuery query);

    Result list(SysPermissionQuery query);
}
