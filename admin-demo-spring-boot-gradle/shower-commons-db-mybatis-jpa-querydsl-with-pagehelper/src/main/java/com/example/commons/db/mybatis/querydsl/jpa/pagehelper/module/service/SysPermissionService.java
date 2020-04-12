package com.example.commons.db.mybatis.querydsl.jpa.pagehelper.module.service;

import com.example.commons.db.mybatis.querydsl.jpa.pagehelper.module.pojo.SysPermission;
import com.example.commons.db.mybatis.querydsl.jpa.pagehelper.module.pojo.SysPermissionExample;
import com.example.commons.db.mybatis.querydsl.jpa.pagehelper.module.pojo.query.SysPermissionQuery;
import com.example.db.pojo.IPageResult;

import java.util.List;

public interface SysPermissionService{


    long countByExample(SysPermissionExample example);

    int deleteByExample(SysPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    List<SysPermission> selectByExample(SysPermissionExample example);

    SysPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(SysPermission record,SysPermissionExample example);

    int updateByExample(SysPermission record,SysPermissionExample example);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);

    int updateBatch(List<SysPermission> list);

    int updateBatchSelective(List<SysPermission> list);

    int batchInsert(List<SysPermission> list);

    int deleteByPrimaryKeys(List<Long> ids);

    IPageResult<SysPermission> selectPageByQuery(SysPermissionQuery query);

    List<SysPermission> selectByQuery(SysPermissionQuery query);

    List<SysPermission> selectByPrimaryKeys(List<Long> ids);
}
