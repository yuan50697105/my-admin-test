package com.example.commons.db.mybatis.base.pagehelper.test.service;

import java.util.List;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.SysUserLog;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.SysUserLogExample;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.query.SysUserLogQuery;
import com.example.commons.db.pojo.IPageResult;

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
