package com.example.commons.db.mybatis.mapper.base.sqlhelper.test.service;

import com.example.commons.db.mybatis.mapper.base.sqlhelper.test.pojo.SysRolePermission;

import java.util.List;

public interface SysRolePermissionService {


    int updateBatch(List<SysRolePermission> list);

    int updateBatchSelective(List<SysRolePermission> list);

    int batchInsert(List<SysRolePermission> list);

    int deleteByRoleId(Long roleId);

    int deleteByRoleIds(List<Long> roleIds);

    int deleteByPermissionId(Long permissionId);

    int deleteByPermissionIds(List<Long> permissionIds);
}