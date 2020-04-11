package com.example.commons.db.mybatis.base.sqlhelper.test.service;

import com.example.commons.db.mybatis.base.sqlhelper.test.pojo.SysPermission;
import com.example.commons.db.mybatis.base.sqlhelper.test.pojo.SysPermissionExample;
import com.example.commons.db.mybatis.base.sqlhelper.test.pojo.query.SysPermissionQuery;
import com.example.db.pojo.IPageResult;

import java.util.List;

public interface SysPermissionService {


    long countByExample(SysPermissionExample example);

    int deleteByExample(SysPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    List<SysPermission> selectByExample(SysPermissionExample example);

    SysPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(SysPermission record, SysPermissionExample example);

    int updateByExample(SysPermission record, SysPermissionExample example);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);

    int updateBatch(List<SysPermission> list);

    int updateBatchSelective(List<SysPermission> list);

    int batchInsert(List<SysPermission> list);

    List<SysPermission> selectByIds(List<Long> ids);

    int deleteByIds(List<Long> ids);

    IPageResult<SysPermission> selectPageByQuery(SysPermissionQuery query);

    List<SysPermission> selectByQuery(SysPermissionQuery query);

    IPageResult<SysPermission> selectPageByExample(SysPermissionExample example, Integer page, Integer size);
}
