package com.example.commons.db.mybatis.jpa.base.pagehelper.module.service;

import java.util.List;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.SysRole;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.SysRoleExample;
public interface SysRoleService{


    long countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExample(SysRoleExample example);

    SysRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(SysRole record,SysRoleExample example);

    int updateByExample(SysRole record,SysRoleExample example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    int updateBatch(List<SysRole> list);

    int updateBatchSelective(List<SysRole> list);

    int batchInsert(List<SysRole> list);

}
