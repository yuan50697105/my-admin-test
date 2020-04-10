package com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.service;

import java.util.List;
import com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.pojo.SysRolePermission;
public interface SysRolePermissionService{


    int updateBatch(List<SysRolePermission> list);

    int updateBatchSelective(List<SysRolePermission> list);

    int batchInsert(List<SysRolePermission> list);

}
