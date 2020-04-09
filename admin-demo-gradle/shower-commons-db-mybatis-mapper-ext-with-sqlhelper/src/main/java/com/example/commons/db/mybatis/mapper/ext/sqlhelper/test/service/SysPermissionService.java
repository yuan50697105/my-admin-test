package com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.service;

import java.util.List;
import com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.pojo.SysPermission;
public interface SysPermissionService{


    int updateBatch(List<SysPermission> list);

    int updateBatchSelective(List<SysPermission> list);

    int batchInsert(List<SysPermission> list);

}
