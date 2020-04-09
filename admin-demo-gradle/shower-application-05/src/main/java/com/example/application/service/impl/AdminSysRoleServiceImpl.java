package com.example.application.service.impl;

import cn.hutool.core.util.IdUtil;
import com.example.application.pojo.admin.role.AdminSysRoleSaveRequestBody;
import com.example.application.pojo.admin.role.AdminSysRoleUpdateRequestBody;
import com.example.application.service.AdminSysRoleService;
import com.example.commons.db.mybatis.mapper.base.pagehelper.test.constants.EnableConstants;
import com.example.commons.db.mybatis.mapper.base.pagehelper.test.pojo.SysRole;
import com.example.commons.db.mybatis.mapper.base.pagehelper.test.pojo.query.SysRoleQuery;
import com.example.commons.db.mybatis.mapper.base.pagehelper.test.service.SysRoleService;
import com.example.commons.db.pojo.IPageResult;
import com.example.commons.web.pojo.Result;
import com.example.commons.web.utils.ResultUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    @Transactional
    public Result save(AdminSysRoleSaveRequestBody requestBody) {
        SysRole sysRole = createRoleFromRequestBody(requestBody);
        sysRoleService.insert(sysRole);
        return saveSuccess();
    }

    @Override
    @Transactional
    public Result update(AdminSysRoleUpdateRequestBody requestBody) {
        SysRole sysRole = sysRoleService.selectByPrimaryKey(requestBody.getId());
        if (isNotEmpty(sysRole)) {
            updateRoleFromReqestBody(sysRole, requestBody);
            sysRoleService.updateByPrimaryKeySelective(sysRole);
        }
        return updateSuccess();
    }

    @Override
    @Transactional
    public Result delete(Long id) {
        sysRoleService.deleteByPrimaryKey(id);
        return deleteSuccess();
    }

    @Override
    @Transactional
    public Result delete(List<Long> ids) {
        sysRoleService.deleteByIds(ids);
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

    private void updateRoleFromReqestBody(SysRole sysRole, AdminSysRoleUpdateRequestBody requestBody) {
        sysRole.copyFrom(requestBody);
    }
}