package com.example.commons.db.mybatis.ext.sqlhelper.test.service;

import com.example.commons.db.mybatis.ext.sqlhelper.test.pojo.SysUserRole;
import com.example.commons.db.mybatis.ext.sqlhelper.test.pojo.SysUserRoleExample;

import java.util.List;

public interface SysUserRoleService {


    long countByExample(SysUserRoleExample example);

    int deleteByExample(SysUserRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    List<SysUserRole> selectByExample(SysUserRoleExample example);

    SysUserRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(SysUserRole record, SysUserRoleExample example);

    int updateByExample(SysUserRole record, SysUserRoleExample example);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);

    int updateBatch(List<SysUserRole> list);

    int updateBatchSelective(List<SysUserRole> list);

    int batchInsert(List<SysUserRole> list);

    int deleteByRoleId(Long roleId);

    int deleteByRoleIds(List<Long> roleIds);

    int deleteByUserId(Long userId);

    int deleteByUserIds(List<Long> userIds);
}


