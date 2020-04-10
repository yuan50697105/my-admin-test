package com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.service;

import com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.pojo.SysUserRole;
import java.util.List;
public interface SysUserRoleService{


    int updateBatch(List<SysUserRole> list);

    int updateBatchSelective(List<SysUserRole> list);

    int batchInsert(List<SysUserRole> list);

}
