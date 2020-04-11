package com.example.application.service.admin.impl;

import cn.hutool.core.util.IdUtil;
import com.example.application.pojo.admin.role.AdminSysPermissionUpdateRequestBody;
import com.example.application.pojo.admin.role.AdminSysRoleSaveRequestBody;
import com.example.application.pojo.admin.role.AdminSysRoleUpdateRequestBody;
import com.example.application.service.admin.AdminSysRoleService;
import com.example.application.service.base.impl.BaseServiceImpl;
import com.example.commons.db.mybatis.base.pagehelper.test.constants.EnableConstants;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.SysPermission;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.SysRole;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.SysRolePermission;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.query.SysRoleQuery;
import com.example.commons.db.mybatis.base.pagehelper.test.service.SysPermissionService;
import com.example.commons.db.mybatis.base.pagehelper.test.service.SysRolePermissionService;
import com.example.commons.db.mybatis.base.pagehelper.test.service.SysRoleService;
import com.example.commons.db.mybatis.base.pagehelper.test.service.SysUserRoleService;
import com.example.commons.db.pojo.IPageResult;
import com.example.commons.web.pojo.Result;
import com.example.commons.web.utils.ResultUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static cn.hutool.core.util.ObjectUtil.isNotEmpty;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 14:51
 */
@Service
@AllArgsConstructor
public class AdminSysRoleServiceImpl extends BaseServiceImpl implements AdminSysRoleService {
    private SysRoleService sysRoleService;
    private SysPermissionService sysPermissionService;
    private SysRolePermissionService sysRolePermissionService;
    private SysUserRoleService sysUserRoleService;

    @Override
    @Transactional
    public Result save(AdminSysRoleSaveRequestBody requestBody) {
        SysRole sysRole = createRoleFromRequestBody(requestBody);
        sysRoleService.insert(sysRole);
        List<SysPermission> sysPermissions = sysPermissionService.selectByIds(requestBody.getPermissionIds());
        List<SysRolePermission> sysRolePermissions = createRolePermissionList(sysRole, sysPermissions);
        sysRolePermissionService.batchInsert(sysRolePermissions);
        return saveSuccess();
    }

    @Override
    @Transactional
    public Result updateInfo(AdminSysRoleUpdateRequestBody requestBody) {
        SysRole sysRole = sysRoleService.selectByPrimaryKey(requestBody.getId());
        if (isNotEmpty(sysRole)) {
            updateRoleFromRequestBody(sysRole, requestBody);
            sysRoleService.updateByPrimaryKeySelective(sysRole);
        }
        return updateSuccess();
    }

    @Override
    @Transactional
    public Result updatePermission(AdminSysPermissionUpdateRequestBody requestBody) {
        Long id = requestBody.getId();
        List<Long> permissionIds = requestBody.getPermissionIds();
        SysRole sysRole = sysRoleService.selectByPrimaryKey(requestBody.getId());
        List<SysPermission> sysPermissions = sysPermissionService.selectByIds(permissionIds);
        sysRolePermissionService.deleteByRoleId(id);
        List<SysRolePermission> sysRolePermissions = createRolePermissionList(sysRole, sysPermissions);
        sysRolePermissionService.batchInsert(sysRolePermissions);
        return updateSuccess();
    }

    @Override
    @Transactional
    public Result delete(Long id) {
        sysRoleService.deleteByPrimaryKey(id);
        sysRolePermissionService.deleteByRoleId(id);
        sysUserRoleService.deleteByRoleId(id);
        return deleteSuccess();
    }

    @Override
    @Transactional
    public Result delete(List<Long> ids) {
        sysRoleService.deleteByIds(ids);
        sysRolePermissionService.deleteByRoleIds(ids);
        sysUserRoleService.deleteByRoleIds(ids);
        return deleteSuccess();
    }

    @Override
    public Result get(Long id) {
        SysRole sysRole = sysRoleService.selectByPrimaryKey(id);
        return ResultUtils.data("role", sysRole);
    }

    @Override
    public Result data(SysRoleQuery query) {
        IPageResult<SysRole> pageResult = sysRoleService.selectPageByQuery(query);
        return ResultUtils.data(pageResult);
    }

    @Override
    public Result list(SysRoleQuery query) {
        List<SysRole> list = sysRoleService.selectByQuery(query);
        return ResultUtils.data("data", list);
    }

    private SysRole createRoleFromRequestBody(AdminSysRoleSaveRequestBody requestBody) {
        SysRole sysRole = new SysRole();
        sysRole.setCode(IdUtil.objectId());
        sysRole.setName(requestBody.getName());
        sysRole.setEnabled(EnableConstants.ENABLED);
        return sysRole;
    }

    private List<SysRolePermission> createRolePermissionList(SysRole sysRole, List<SysPermission> sysPermissions) {
        int initSize = isNotEmpty(sysPermissions) ? sysPermissions.size() : 1;
        ArrayList<SysRolePermission> sysRolePermissions = new ArrayList<>(initSize);
        for (SysPermission sysPermission : sysPermissions) {
            sysRolePermissions.add(new SysRolePermission(sysRole.getId(), sysPermission.getId()));
        }
        return sysRolePermissions;
    }

    private void updateRoleFromRequestBody(SysRole sysRole, AdminSysRoleUpdateRequestBody requestBody) {
        sysRole.copyFrom(requestBody);
    }
}