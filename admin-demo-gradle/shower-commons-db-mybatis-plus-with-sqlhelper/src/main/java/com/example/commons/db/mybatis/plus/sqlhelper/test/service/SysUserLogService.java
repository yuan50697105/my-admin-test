package com.example.commons.db.mybatis.plus.sqlhelper.test.service;

import java.util.List;
import com.example.commons.db.mybatis.plus.sqlhelper.test.pojo.SysUserLog;
import com.example.commons.db.mybatis.plus.sqlhelper.test.pojo.SysUserLogExample;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SysUserLogService extends IService<SysUserLog>{


    long countByExample(SysUserLogExample example);

    int deleteByExample(SysUserLogExample example);

    List<SysUserLog> selectByExample(SysUserLogExample example);

    int updateByExampleSelective(SysUserLog record,SysUserLogExample example);

    int updateByExample(SysUserLog record,SysUserLogExample example);

    int updateBatch(List<SysUserLog> list);

    int updateBatchSelective(List<SysUserLog> list);

    int batchInsert(List<SysUserLog> list);

}
