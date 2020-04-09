package com.example.commons.db.mybatis.mapper.ext.pagehelper.test.service;

import com.example.commons.db.mybatis.mapper.ext.pagehelper.test.pojo.SysUser;
import java.util.List;
public interface SysUserService{


    int updateBatch(List<SysUser> list);

    int updateBatchSelective(List<SysUser> list);

    int batchInsert(List<SysUser> list);

}
