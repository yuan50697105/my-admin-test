package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service;


import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.SysUserLog;

import java.util.List;

public interface SysUserLogService {


    int updateBatch(List<SysUserLog> list);

    int updateBatchSelective(List<SysUserLog> list);

    int batchInsert(List<SysUserLog> list);

}

