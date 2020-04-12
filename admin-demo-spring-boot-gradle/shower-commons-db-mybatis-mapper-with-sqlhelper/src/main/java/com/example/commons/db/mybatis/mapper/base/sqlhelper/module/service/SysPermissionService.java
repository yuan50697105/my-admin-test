package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service;

import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.SysPermission;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.query.SysPermissionQuery;
import com.example.db.pojo.IPageResult;

import java.util.List;

public interface SysPermissionService {


    int updateBatch(List<SysPermission> list);

    int updateBatchSelective(List<SysPermission> list);

    int batchInsert(List<SysPermission> list);

    int insert(SysPermission sysPermission);

    SysPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysPermission sysPermission);

    int deleteByPrimaryKey(Long id);

    int deleteByIds(List<Long> ids);

    IPageResult<SysPermission> selectPageByQuery(SysPermissionQuery query);

    List<SysPermission> selectByQuery(SysPermissionQuery query);

    List<SysPermission> selectByIds(List<Long> ids);
}

