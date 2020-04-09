package com.example.commons.db.mybatis.ext.pagehelper.test.service;

import com.example.commons.db.mybatis.ext.pagehelper.test.pojo.SysUser;
import com.example.commons.db.mybatis.ext.pagehelper.test.pojo.SysUserExample;
import com.example.commons.db.mybatis.ext.pagehelper.test.pojo.query.SysUserQuery;
import com.example.commons.db.pojo.IPageResult;

import java.util.List;

public interface SysUserService {


    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Long id);

    int deleteByIds(List<Long> ids);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(SysUser record, SysUserExample example);

    int updateByExample(SysUser record, SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    IPageResult<SysUser> selectPageByQuery(SysUserQuery query);

    IPageResult<SysUser> selectPageByExample(SysUserExample example, int page, int size);

    List<SysUser> selectByQuery(SysUserQuery query);

    int updateBatch(List<SysUser> list);

    int updateBatchSelective(List<SysUser> list);

    int batchInsert(List<SysUser> list);

    boolean existByUsername(String username);
}


