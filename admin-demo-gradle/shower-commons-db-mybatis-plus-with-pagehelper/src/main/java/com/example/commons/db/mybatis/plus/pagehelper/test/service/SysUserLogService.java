package com.example.commons.db.mybatis.plus.pagehelper.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.commons.db.mybatis.plus.pagehelper.test.pojo.SysUserLog;
import com.example.commons.db.mybatis.plus.pagehelper.test.pojo.SysUserLogExample;

import java.util.List;

public interface SysUserLogService extends IService<SysUserLog> {


    int updateBatch(List<SysUserLog> list);

    int updateBatchSelective(List<SysUserLog> list);

    int batchInsert(List<SysUserLog> list);

    long countByExample(SysUserLogExample example);

    int deleteByExample(SysUserLogExample example);

    List<SysUserLog> selectByExample(SysUserLogExample example);

    int updateByExampleSelective(SysUserLog record, SysUserLogExample example);

    int updateByExample(SysUserLog record, SysUserLogExample example);
}

