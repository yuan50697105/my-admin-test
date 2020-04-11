package com.example.application.admin.service.impl;

import com.example.application.admin.pojo.user.AdminSysUserSaveRequestBody;
import com.example.application.admin.pojo.user.AdminSysUserUpdateRequestBody;
import com.example.application.admin.pojo.user.AdminUserRoleUpdateRequestBody;
import com.example.application.admin.service.AdminSysUserService;
import com.example.commons.db.mybatis.base.sqlhelper.test.pojo.SysRole;
import com.example.commons.db.mybatis.base.sqlhelper.test.pojo.SysUser;
import com.example.commons.db.mybatis.base.sqlhelper.test.pojo.SysUserRole;
import com.example.commons.db.mybatis.base.sqlhelper.test.pojo.query.SysUserQuery;
import com.example.commons.db.mybatis.base.sqlhelper.test.service.SysRoleService;
import com.example.commons.db.mybatis.base.sqlhelper.test.service.SysUserRoleService;
import com.example.commons.db.mybatis.base.sqlhelper.test.service.SysUserService;
import com.example.db.pojo.IPageResult;
import com.example.commons.web.exception.ResultRuntimeException;
import com.example.commons.web.pojo.Result;
import com.example.commons.web.utils.ResultUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static cn.hutool.core.util.ObjectUtil.isNotEmpty;
import static org.springframework.util.ObjectUtils.isEmpty;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 13:46
 */
@Service
@AllArgsConstructor
public class AdminSysUserServiceImpl implements AdminSysUserService {
    private SysUserService sysUserService;
    private SysUserRoleService sysUserRoleService;
    private SysRoleService sysRoleService;

    /**
     * 保存用户
     *
     * @param requestBody 请求实体
     * @return 处理结果
     */
    @Override
    @Transactional
    public Result save(AdminSysUserSaveRequestBody requestBody) {
        boolean checkResult = checkUserExist(requestBody);
        if (checkResult) {
            throw new ResultRuntimeException(ResultUtils.userExistError());
        }
        SysUser sysUser = createUserFromRequestBody(requestBody);
        sysUserService.insert(sysUser);
        List<SysRole> sysRoles = sysRoleService.selectByIds(requestBody.getRoleIds());
        List<SysUserRole> userRoles = createUserRoleList(sysUser, sysRoles);
        sysUserRoleService.batchInsert(userRoles);
        return ResultUtils.saveOk();
    }

    /**
     * 更新用户信息
     *
     * @param requestBody 请求实体
     * @return 处理结果
     */
    @Override
    @Transactional
    public Result updateInfo(AdminSysUserUpdateRequestBody requestBody) {
        SysUser sysUser = sysUserService.selectByPrimaryKey(requestBody.getId());
        if (isEmpty(sysUser)) {
            throw new ResultRuntimeException(ResultUtils.userNotFoundError());
        }
        updateUserInfoFromRequestBody(sysUser, requestBody);
        sysUserService.updateByPrimaryKeySelective(sysUser);
        return ResultUtils.updateOk();
    }

    @Override
    @Transactional
    public Result updateRole(AdminUserRoleUpdateRequestBody requestBody) {
        Long userId = requestBody.getUserId();
        List<Long> roleIds = requestBody.getRoleIds();
        SysUser sysUser = sysUserService.selectByPrimaryKey(userId);
        if (isEmpty(sysUser)) {
            throw new ResultRuntimeException(ResultUtils.userNotFoundError());
        }
        List<SysRole> sysRoles = sysRoleService.selectByIds(roleIds);
        sysUserRoleService.deleteByUserId(userId);
        List<SysUserRole> sysUserRoles = createUserRoleList(sysUser, sysRoles);
        sysUserRoleService.batchInsert(sysUserRoles);
        return ResultUtils.updateOk();
    }

    /**
     * 主键查询
     *
     * @param id 主键
     * @return 用户信息
     */
    @Override
    public Result get(Long id) {
        SysUser sysUser = sysUserService.selectByPrimaryKey(id);
        return ResultUtils.data("user", Optional.ofNullable(sysUser).orElse(new SysUser()));
    }

    /**
     * 删除用户
     *
     * @param id 主键
     * @return 处理结果
     */
    @Override
    @Transactional
    public Result delete(Long id) {
        sysUserService.deleteByPrimaryKey(id);
        sysUserRoleService.deleteByUserId(id);
        return ResultUtils.deleteOk();
    }

    @Override
    @Transactional
    public Result delete(List<Long> ids) {
        sysUserService.deleteByIds(ids);
        sysUserRoleService.deleteByUserIds(ids);
        return ResultUtils.deleteOk();
    }

    /**
     * 分页表格数据
     *
     * @param query 查询条件封装
     * @return 分页结果
     */
    @Override
    public Result data(SysUserQuery query) {
        IPageResult<SysUser> pageResult = sysUserService.selectPageByQuery(query);
        return ResultUtils.data(pageResult);
    }

    /**
     * 列表查询
     *
     * @param query 查询条件
     * @return 数据列表
     */
    @Override
    public Result list(SysUserQuery query) {
        List<SysUser> list = sysUserService.selectByQuery(query);
        return ResultUtils.data("data", list);
    }

    /**
     * 创建保存实体
     *
     * @param requestBody 请求实体
     * @return 用户实体
     */
    private SysUser createUserFromRequestBody(AdminSysUserSaveRequestBody requestBody) {
        SysUser sysUser = new SysUser();
        sysUser.setUsername(requestBody.getUsername());
        sysUser.setName(requestBody.getName());
        sysUser.setPassword(requestBody.getPassword());
        return sysUser;
    }

    /**
     * 创建用户角色列表
     *
     * @param sysUser  用户信息
     * @param sysRoles 角色信息
     * @return 用户角色列表
     */
    private List<SysUserRole> createUserRoleList(SysUser sysUser, List<SysRole> sysRoles) {
        int initSize = isNotEmpty(sysRoles) ? sysRoles.size() : 1;
        ArrayList<SysUserRole> sysUserRoles = new ArrayList<>(initSize);
        for (SysRole sysRole : sysRoles) {
            sysUserRoles.add(new SysUserRole(sysUser.getId(), sysRole.getId()));
        }
        return sysUserRoles;
    }

    /**
     * 更新用户信息
     *
     * @param sysUser     数据库原始数据
     * @param requestBody 请求实体
     */
    private void updateUserInfoFromRequestBody(SysUser sysUser, AdminSysUserUpdateRequestBody requestBody) {
        sysUser.copyFrom(requestBody);
    }

    /**
     * 检查用户是否存在
     *
     * @param requestBody 用户添加实体
     * @return 存在true，不存在false
     */
    private boolean checkUserExist(AdminSysUserSaveRequestBody requestBody) {
        return sysUserService.existByUsername(requestBody.getUsername());
    }
}