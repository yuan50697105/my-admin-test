package com.example.commons.db.mybatis.plus.sqlhelper.module.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.SysRolePermission;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.SysRolePermissionExample;

import java.util.List;

public interface SysRolePermissionService extends IService<SysRolePermission> {


    int updateBatch(List<SysRolePermission> list);

    int updateBatchSelective(List<SysRolePermission> list);

    int batchInsert(List<SysRolePermission> list);

    long countByExample(SysRolePermissionExample example);

    int deleteByExample(SysRolePermissionExample example);

    List<SysRolePermission> selectByExample(SysRolePermissionExample example);

    int updateByExampleSelective(SysRolePermission record, SysRolePermissionExample example);

    int updateByExample(SysRolePermission record, SysRolePermissionExample example);

    boolean removeByPermissionId(Long permissionId);

    boolean removeByPermissionIds(List<Long> permissionIds);

    boolean removeByRoleId(Long roleId);

    boolean removeByRoleIds(List<Long> roleIds);
}


