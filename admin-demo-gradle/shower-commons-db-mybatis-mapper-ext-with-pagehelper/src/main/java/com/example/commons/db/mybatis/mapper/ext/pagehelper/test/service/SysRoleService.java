package com.example.commons.db.mybatis.mapper.ext.pagehelper.test.service;

import java.util.List;
import com.example.commons.db.mybatis.mapper.ext.pagehelper.test.pojo.SysRole;
public interface SysRoleService{


    int updateBatch(List<SysRole> list);

    int updateBatchSelective(List<SysRole> list);

    int batchInsert(List<SysRole> list);

}
