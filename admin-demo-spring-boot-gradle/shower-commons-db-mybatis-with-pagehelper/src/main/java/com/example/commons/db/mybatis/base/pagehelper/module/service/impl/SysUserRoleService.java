package com.example.commons.db.mybatis.base.pagehelper.module.service.impl;

import java.util.List;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysUserRole;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysUserRoleExample;
public interface SysUserRoleService{


    long countByExample(SysUserRoleExample example);

    int deleteByExample(SysUserRoleExample example);

    int deleteByPrimaryKey(Long id);

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
