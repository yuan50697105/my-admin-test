package com.example.commons.db.mybatis.jpa.base.pagehelper.module.service;

import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.SysUser;
import java.util.List;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.SysUserExample;
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

}
