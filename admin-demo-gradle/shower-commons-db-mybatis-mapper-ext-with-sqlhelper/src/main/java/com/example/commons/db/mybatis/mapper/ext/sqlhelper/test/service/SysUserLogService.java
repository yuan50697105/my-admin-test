package com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.service;

import java.util.List;
import com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.pojo.SysUserLog;
public interface SysUserLogService{


    int updateBatch(List<SysUserLog> list);

    int updateBatchSelective(List<SysUserLog> list);

    int batchInsert(List<SysUserLog> list);

}
