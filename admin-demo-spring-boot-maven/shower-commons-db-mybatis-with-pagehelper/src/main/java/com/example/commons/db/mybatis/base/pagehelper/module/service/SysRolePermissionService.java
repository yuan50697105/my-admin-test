package com.example.commons.db.mybatis.base.pagehelper.module.service;

import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysRolePermission;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysRolePermissionExample;

import java.util.List;

public interface SysRolePermissionService {


    long countByExample(SysRolePermissionExample example);

    int deleteByExample(SysRolePermissionExample example);

    int deleteByPrimaryKey(Long id);

    int deleteByRoleId(Long roleId);

    int deleteByRoleIds(List<Long> roleIds);

    int deleteByPermissionId(Long permissinoId);

    int deleteByPermissionIds(List<Long> permissionIds);

    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);

    List<SysRolePermission> selectByExample(SysRolePermissionExample example);

    SysRolePermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(SysRolePermission record, SysRolePermissionExample example);

    int updateByExample(SysRolePermission record, SysRolePermissionExample example);

    int updateByPrimaryKeySelective(SysRolePermission record);

    int updateByPrimaryKey(SysRolePermission record);

    int updateBatch(List<SysRolePermission> list);

    int updateBatchSelective(List<SysRolePermission> list);

    int batchInsert(List<SysRolePermission> list);
}

