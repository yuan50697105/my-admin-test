package com.example.commons.db.mybatis.jpa.base.pagehelper.module.service;

import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.SysUser;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.SysUserExample;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.query.SysUserQuery;
import com.example.commons.db.pojo.IPageResult;

import java.util.List;
public interface SysUserService{


    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(SysUser record,SysUserExample example);

    int updateByExample(SysUser record,SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    int updateBatch(List<SysUser> list);

    int updateBatchSelective(List<SysUser> list);

    int batchInsert(List<SysUser> list);

    int deleteByPrimaryKeys(List<Long> ids);

    IPageResult<SysUser> selectPageByQuery(SysUserQuery query);

    List<SysUser> selectByQuery(SysUserQuery query);

    boolean existByUsername(String username);
}
