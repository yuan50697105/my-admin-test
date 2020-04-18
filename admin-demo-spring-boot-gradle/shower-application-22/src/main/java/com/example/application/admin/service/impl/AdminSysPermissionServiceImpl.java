package com.example.application.admin.service.impl;

import com.example.application.admin.pojo.permission.AdminSysPermissionSaveRequestBody;
import com.example.application.admin.pojo.permission.AdminSysPermissionUpdateRequestBody;
import com.example.application.admin.service.AdminSysPermissionService;
import com.example.commons.db.mybatis.plus.sqlhelper.module.constants.EnableConstants;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.SysPermission;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.query.SysPermissionQuery;
import com.example.commons.db.mybatis.plus.sqlhelper.module.service.SysPermissionService;
import com.example.commons.db.mybatis.plus.sqlhelper.module.service.SysRolePermissionService;
import com.example.commons.web.base.pojo.Result;
import com.example.commons.web.base.utils.ResultUtils;
import com.example.commons.db.pojo.IPageResult;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-09 19:49
 */
@Service
@AllArgsConstructor
public class AdminSysPermissionServiceImpl implements AdminSysPermissionService {
    private final SysPermissionService sysPermissionService;
    private final SysRolePermissionService sysRolePermissionService;

    @Override
    @Transactional
    public Result save(AdminSysPermissionSaveRequestBody requestBody) {
        SysPermission sysPermission = createPermissionFromRequestBody(requestBody);
        sysPermissionService.save(sysPermission);
        return ResultUtils.saveOk();
    }

    @Override
    @Transactional
    public Result update(AdminSysPermissionUpdateRequestBody requestBody) {
        SysPermission sysPermission = sysPermissionService.getById(requestBody.getId());
        updateFromRequestBody(sysPermission, requestBody);
        sysPermissionService.updateById(sysPermission);
        return ResultUtils.updateOk();
    }

    @Override
    @Transactional
    public Result delete(Long id) {
        sysPermissionService.removeById(id);
        sysRolePermissionService.removeByPermissionId(id);
        return ResultUtils.deleteOk();
    }

    @Override
    @Transactional
    public Result delete(List<Long> ids) {
        sysPermissionService.removeByIds(ids);
        sysRolePermissionService.removeByPermissionIds(ids);
        return ResultUtils.deleteOk();
    }

    @Override
    public Result get(Long id) {
        SysPermission sysPermission = sysPermissionService.getById(id);
        return ResultUtils.data("permission", sysPermission);
    }

    @Override
    public Result data(SysPermissionQuery query) {
        IPageResult<SysPermission> data = sysPermissionService.selectPageByQuery(query);
        return ResultUtils.data(data);
    }

    @Override
    public Result list(SysPermissionQuery query) {
        List<SysPermission> data = sysPermissionService.selectByQuery(query);
        return ResultUtils.data("data", data);
    }


    private SysPermission createPermissionFromRequestBody(AdminSysPermissionSaveRequestBody requestBody) {
        SysPermission sysPermission = new SysPermission();
        sysPermission.setName(requestBody.getName());
        sysPermission.setCode(UUID.randomUUID().toString());
        sysPermission.setEnabled(EnableConstants.ENABLED);
        sysPermission.setType(requestBody.getType());
        return sysPermission;
    }

    private void updateFromRequestBody(SysPermission sysPermission, AdminSysPermissionUpdateRequestBody requestBody) {
        sysPermission.copyFrom(requestBody);
    }
}