package com.example.commons.db.mybatis.base.pagehelper.module.service;

import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysRole;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysRoleExample;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.query.SysRoleQuery;
import com.example.commons.db.pojo.IPageResult;

import java.util.List;

public interface SysRoleService{


    long countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    int deleteByPrimaryKey(Long id);

    int deleteByPrimaryKeys(List<Long> ids);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExample(SysRoleExample example);

    SysRole selectByPrimaryKey(Long id);

    List<SysRole> selectByPrimaryKeys(List<Long> ids);

    int updateByExampleSelective(SysRole record,SysRoleExample example);

    int updateByExample(SysRole record,SysRoleExample example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    IPageResult<SysRole> selectPageByQuery(SysRoleQuery query);

    IPageResult<SysRole> selectPageByExample(SysRoleExample example, int page, int size);

    List<SysRole> selectByQuery(SysRoleQuery query);

    int updateBatch(List<SysRole> list);

    int updateBatchSelective(List<SysRole> list);

    int batchInsert(List<SysRole> list);
}
