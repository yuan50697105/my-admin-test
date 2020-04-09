package com.example.commons.db.mybatis.ext.pagehelper.test.service;

import com.example.commons.db.mybatis.ext.pagehelper.test.pojo.SysUserRole;
import com.example.commons.db.mybatis.ext.pagehelper.test.pojo.SysUserRoleExample;

import java.util.List;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-09 22:00
 */
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
