package com.example.commons.db.mybatis.mapper.base.pagehelper.test.service;

import java.util.List;
import com.example.commons.db.mybatis.mapper.base.pagehelper.test.pojo.SysUserLog;
public interface SysUserLogService{


    int updateBatch(List<SysUserLog> list);

    int updateBatchSelective(List<SysUserLog> list);

    int batchInsert(List<SysUserLog> list);

}
