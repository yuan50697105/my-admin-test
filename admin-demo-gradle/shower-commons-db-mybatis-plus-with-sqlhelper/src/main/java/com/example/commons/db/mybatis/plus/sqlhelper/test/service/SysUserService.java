package com.example.commons.db.mybatis.plus.sqlhelper.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.commons.db.mybatis.plus.sqlhelper.test.pojo.SysUser;
import com.example.commons.db.mybatis.plus.sqlhelper.test.pojo.SysUserExample;
import com.example.commons.db.mybatis.plus.sqlhelper.test.pojo.query.SysUserQuery;
import com.example.commons.db.pojo.IPageResult;

import java.util.List;
public interface SysUserService extends IService<SysUser>{


    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    List<SysUser> selectByExample(SysUserExample example);

    int updateByExampleSelective(SysUser record,SysUserExample example);

    int updateByExample(SysUser record,SysUserExample example);

    int updateBatch(List<SysUser> list);

    int updateBatchSelective(List<SysUser> list);

    int batchInsert(List<SysUser> list);

    boolean insert(SysUser sysUser);

    SysUser selectById(Long id);

    boolean deleteById(Long id);

    boolean deleteByIds(List<Long> ids);

    IPageResult<SysUser> selectPageByQuery(SysUserQuery query);

    List<SysUser> selectByQuery(SysUserQuery query);
}
