package com.example.commons.db.mybatis.jpa.base.pagehelper.module.service;

import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.SysRolePermission;
import java.util.List;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.SysRolePermissionExample;
public interface SysRolePermissionService{


    long countByExample(SysRolePermissionExample example);

    int deleteByExample(SysRolePermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);

    List<SysRolePermission> selectByExample(SysRolePermissionExample example);

    SysRolePermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(SysRolePermission record,SysRolePermissionExample example);

    int updateByExample(SysRolePermission record,SysRolePermissionExample example);

    int updateByPrimaryKeySelective(SysRolePermission record);

    int updateByPrimaryKey(SysRolePermission record);

    int updateBatch(List<SysRolePermission> list);

    int updateBatchSelective(List<SysRolePermission> list);

    int batchInsert(List<SysRolePermission> list);

}
