package com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.service;

import com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.pojo.SysPermission;import java.util.List;

public interface SysPermissionService {


    int updateBatch(List<SysPermission> list);

    int updateBatchSelective(List<SysPermission> list);

    int batchInsert(List<SysPermission> list);
}

