package com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.service;

import java.util.List;
import com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.pojo.SysUser;
public interface SysUserService{


    int updateBatch(List<SysUser> list);

    int updateBatchSelective(List<SysUser> list);

    int batchInsert(List<SysUser> list);

}
