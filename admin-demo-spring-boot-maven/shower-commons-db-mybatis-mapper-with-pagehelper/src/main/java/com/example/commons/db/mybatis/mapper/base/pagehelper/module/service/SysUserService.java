package com.example.commons.db.mybatis.mapper.base.pagehelper.module.service;

import com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.SysUser;
import com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.query.SysUserQuery;
import com.example.commons.db.pojo.IPageResult;

import java.util.List;

public interface SysUserService {


    int updateBatch(List<SysUser> list);

    int updateBatchSelective(List<SysUser> list);

    int batchInsert(List<SysUser> list);

    int insert(SysUser sysUser);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser sysUser);

    int deleteByPrimaryKey(Long id);

    int deleteByIds(List<Long> ids);

    IPageResult<SysUser> selectPageByQuery(SysUserQuery query);

    List<SysUser> selectByQuery(SysUserQuery query);

    boolean existByUsername(String username);
}

