package com.example.commons.db.mybatis.mapper.base.pagehelper.module.service;

import java.util.List;
import com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.SysUserLog;

public interface SysUserLogService {


    int updateBatch(List<SysUserLog> list);

    int updateBatchSelective(List<SysUserLog> list);

    int batchInsert(List<SysUserLog> list);

}

