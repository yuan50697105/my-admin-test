package com.example.application.admin.service;

import com.example.application.admin.pojo.user.AdminSysUserSaveRequestBody;
import com.example.application.admin.pojo.user.AdminSysUserUpdateRequestBody;
import com.example.application.admin.pojo.user.AdminUserRoleUpdateRequestBody;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.query.SysUserQuery;
import com.example.commons.web.pojo.Result;

import java.util.List;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 13:46
 */
public interface AdminSysUserService {

    /**
     * 保存用户信息
     *
     * @param requestBody 请求实体
     * @return 处理结果
     */
    Result save(AdminSysUserSaveRequestBody requestBody);

    /**
     * 主键列表删除
     *
     * @param ids 主键列表
     * @return 处理结果
     */
    Result delete(List<Long> ids);

    /**
     * 修改用户信息
     *
     * @param requestBody 请求实体
     * @return 处理结果
     */
    Result updateInfo(AdminSysUserUpdateRequestBody requestBody);

    /**
     * 修改用户角色
     *
     * @param requestBody 请求实体
     * @return 处理结果
     */
    Result updateRole(AdminUserRoleUpdateRequestBody requestBody);

    /**
     * 主键查询
     *
     * @param id 主键
     * @return 用户信息
     */
    Result get(Long id);

    /**
     * 分页表格数据
     *
     * @param query 查询条件
     * @return 分页结果
     */
    Result data(SysUserQuery query);

    /**
     * 列表查询
     *
     * @param query 查询条件
     * @return 数据列表
     */
    Result list(SysUserQuery query);

    /**
     * 通过主键删除用户
     *
     * @param id 主键
     * @return 处理结果
     */
    Result delete(Long id);
}
