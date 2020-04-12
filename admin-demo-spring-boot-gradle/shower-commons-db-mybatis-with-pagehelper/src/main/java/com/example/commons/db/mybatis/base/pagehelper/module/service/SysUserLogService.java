package com.example.commons.db.mybatis.base.pagehelper.module.service;

import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysUserLog;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysUserLogExample;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.query.SysUserLogQuery;
import com.example.db.pojo.IPageResult;

import java.util.List;

public interface SysUserLogService{


    long countByExample(SysUserLogExample example);

    int deleteByExample(SysUserLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUserLog record);

    int insertSelective(SysUserLog record);

    List<SysUserLog> selectByExample(SysUserLogExample example);

    SysUserLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(SysUserLog record,SysUserLogExample example);

    int updateByExample(SysUserLog record,SysUserLogExample example);

    int updateByPrimaryKeySelective(SysUserLog record);

    int updateByPrimaryKey(SysUserLog record);

    IPageResult<SysUserLog> selectPageByQuery(SysUserLogQuery query);

    IPageResult<SysUserLog> selectPageByExample(SysUserLogExample example, int page, int size);

    int updateBatch(List<SysUserLog> list);

    int updateBatchSelective(List<SysUserLog> list);

    int batchInsert(List<SysUserLog> list);
}
