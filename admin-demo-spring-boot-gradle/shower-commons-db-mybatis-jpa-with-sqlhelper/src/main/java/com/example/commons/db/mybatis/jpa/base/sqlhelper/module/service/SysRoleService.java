package com.example.commons.db.mybatis.jpa.base.sqlhelper.module.service;

import com.example.commons.db.mybatis.jpa.base.sqlhelper.module.pojo.SysRole;
import com.example.commons.db.mybatis.jpa.base.sqlhelper.module.pojo.SysRoleExample;
import com.example.commons.db.mybatis.jpa.base.sqlhelper.module.pojo.query.SysRoleQuery;
import com.example.db.pojo.IPageResult;

import java.util.List;

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

    int deleteByPrimaryKeys(List<Long> ids);

    IPageResult<SysRole> selectPageByQuery(SysRoleQuery query);

    List<SysRole> selectByQuery(SysRoleQuery query);

    List<SysRole> selectByPrimaryKeys(List<Long> ids);
}
