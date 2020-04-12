package com.example.commons.db.mybatis.mapper.base.pagehelper.module.service;

import com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.SysRole;
import com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.query.SysRoleQuery;
import com.example.db.pojo.IPageResult;

import java.util.List;

public interface SysRoleService {


    int updateBatch(List<SysRole> list);

    int updateBatchSelective(List<SysRole> list);

    int batchInsert(List<SysRole> list);

    int insert(SysRole sysRole);

    SysRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRole sysRole);

    int deleteByPrimaryKey(Long id);

    int deleteByIds(List<Long> ids);

    IPageResult<SysRole> selectPageByQuery(SysRoleQuery query);

    List<SysRole> selectByQuery(SysRoleQuery query);

    List<SysRole> selectByIds(List<Long> ids);
}

