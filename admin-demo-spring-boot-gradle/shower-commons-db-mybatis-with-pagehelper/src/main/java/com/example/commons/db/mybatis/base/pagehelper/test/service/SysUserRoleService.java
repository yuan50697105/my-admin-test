package com.example.commons.db.mybatis.base.pagehelper.test.service;

import com.example.commons.db.mybatis.base.pagehelper.test.pojo.SysUserRole;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.SysUserRoleExample;

import java.util.List;
public interface SysUserRoleService{


    long countByExample(SysUserRoleExample example);

    int deleteByExample(SysUserRoleExample example);

    int deleteByPrimaryKey(Long id);

    int deleteByUserId(Long userId);

    int deleteByUserIds(List<Long> userIds);

    int deleteByRoleId(Long roleId);

    int deleteByRoleIds(List<Long> roleIds);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    List<SysUserRole> selectByExample(SysUserRoleExample example);

    SysUserRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(SysUserRole record,SysUserRoleExample example);

    int updateByExample(SysUserRole record,SysUserRoleExample example);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);

    int updateBatch(List<SysUserRole> list);

    int updateBatchSelective(List<SysUserRole> list);

    int batchInsert(List<SysUserRole> list);
}
