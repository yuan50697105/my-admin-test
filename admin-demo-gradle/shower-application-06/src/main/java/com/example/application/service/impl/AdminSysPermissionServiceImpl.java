package com.example.application.service.impl;

import com.example.application.pojo.admin.permission.AdminSysPermissionSaveRequestBody;
import com.example.application.pojo.admin.permission.AdminSysPermissionUpdateRequestBody;
import com.example.application.service.AdminSysPermissionService;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.test.constants.EnableConstants;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.test.pojo.SysPermission;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.test.pojo.query.SysPermissionQuery;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.test.service.SysPermissionService;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.test.service.SysRolePermissionService;
import com.example.commons.db.pojo.IPageResult;
import com.example.commons.web.pojo.Result;
import com.example.commons.web.utils.ResultUtils;
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
public class AdminSysPermissionServiceImpl extends BaseServiceImpl implements AdminSysPermissionService {
    private SysPermissionService sysPermissionService;
    private SysRolePermissionService sysRolePermissionService;

    @Override
    @Transactional
    public Result save(AdminSysPermissionSaveRequestBody requestBody) {
        SysPermission sysPermission = createPermissionFromRequestBody(requestBody);
        sysPermissionService.insert(sysPermission);
        return saveSuccess();
    }

    @Override
    @Transactional
    public Result update(AdminSysPermissionUpdateRequestBody requestBody) {
        SysPermission sysPermission = sysPermissionService.selectByPrimaryKey(requestBody.getId());
        updateFromRequestBody(sysPermission, requestBody);
        sysPermissionService.updateByPrimaryKeySelective(sysPermission);
        return updateSuccess();
    }

    @Override
    @Transactional
    public Result delete(Long id) {
        sysPermissionService.deleteByPrimaryKey(id);
        sysRolePermissionService.deleteByPermissionId(id);
        return deleteSuccess();
    }

    @Override
    @Transactional
    public Result delete(List<Long> ids) {
        sysPermissionService.deleteByIds(ids);
        sysRolePermissionService.deleteByPermissionIds(ids);
        return deleteSuccess();
    }

    @Override
    public Result get(Long id) {
        SysPermission sysPermission = sysPermissionService.selectByPrimaryKey(id);
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