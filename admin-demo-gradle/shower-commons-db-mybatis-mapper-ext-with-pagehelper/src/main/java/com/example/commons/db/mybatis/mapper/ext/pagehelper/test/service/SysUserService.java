package com.example.commons.db.mybatis.mapper.ext.pagehelper.test.service;

import com.example.commons.db.mybatis.mapper.ext.pagehelper.test.pojo.SysUser;
import com.example.commons.db.mybatis.mapper.ext.pagehelper.test.pojo.query.SysUserQuery;
import com.example.commons.db.pojo.IPageResult;

import java.util.List;

public interface SysUserService {


    int insert(SysUser sysUser);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser sysUser);

    int deleteByPrimaryKey(Long id);

    int deleteByIds(List<Long> ids);

    IPageResult<SysUser> selectPageByQuery(SysUserQuery query);

    List<SysUser> selectByQuery(SysUserQuery query);

    List<SysUser> selectByExample(Object object);

    IPageResult<SysUser> selectPageByExample(Object object, int page, int size);

    int updateBatch(List<SysUser> list);

    int updateBatchSelective(List<SysUser> list);

    int batchInsert(List<SysUser> list);

    boolean existByUsername(String username);
}

