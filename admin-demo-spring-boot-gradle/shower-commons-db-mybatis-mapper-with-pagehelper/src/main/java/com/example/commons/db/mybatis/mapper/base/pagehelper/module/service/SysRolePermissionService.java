package com.example.commons.db.mybatis.mapper.base.pagehelper.module.service;

import com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.SysRolePermission;

import java.util.List;

public interface SysRolePermissionService {


    int updateBatch(List<SysRolePermission> list);

    int updateBatchSelective(List<SysRolePermission> list);

    int batchInsert(List<SysRolePermission> list);

    int deleteByPermissionId(Long permissionId);

    int deleteByPermissionIds(List<Long> permissionIds);

    int deleteByRoleId(Long roleId);

    int deleteByRoleIds(List<Long> roleIds);
}

