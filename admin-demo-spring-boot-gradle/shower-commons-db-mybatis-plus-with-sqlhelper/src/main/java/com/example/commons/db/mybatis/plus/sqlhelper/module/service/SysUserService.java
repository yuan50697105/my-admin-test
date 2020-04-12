package com.example.commons.db.mybatis.plus.sqlhelper.module.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.SysUser;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.SysUserExample;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.query.SysUserQuery;
import com.example.db.pojo.IPageResult;

import java.util.List;

public interface SysUserService extends IService<SysUser> {


    int updateBatch(List<SysUser> list);

    int updateBatchSelective(List<SysUser> list);

    int batchInsert(List<SysUser> list);

    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    List<SysUser> selectByExample(SysUserExample example);

    int updateByExampleSelective(SysUser record, SysUserExample example);

    int updateByExample(SysUser record, SysUserExample example);

    int insert(SysUser sysUser);

    SysUser selectByPrimaryKey(Long id);


    boolean deleteByPrimaryKey(Long id);

    boolean deleteByIds(List<Long> ids);

    IPageResult<SysUser> selectPageByQuery(SysUserQuery query);

    List<SysUser> selectByQuery(SysUserQuery query);

    boolean existByUsername(String username);
}


