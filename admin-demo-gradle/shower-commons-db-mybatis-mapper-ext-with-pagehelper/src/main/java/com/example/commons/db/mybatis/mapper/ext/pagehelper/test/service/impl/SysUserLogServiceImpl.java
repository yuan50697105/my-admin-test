package com.example.commons.db.mybatis.mapper.ext.pagehelper.test.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.commons.db.mybatis.mapper.ext.pagehelper.test.pojo.SysUserLog;
import java.util.List;
import com.example.commons.db.mybatis.mapper.ext.pagehelper.test.mapper.SysUserLogMapper;
import com.example.commons.db.mybatis.mapper.ext.pagehelper.test.service.SysUserLogService;
@Service
public class SysUserLogServiceImpl implements SysUserLogService{

    @Resource
    private SysUserLogMapper sysUserLogMapper;

    @Override
    public int updateBatch(List<SysUserLog> list) {
        return sysUserLogMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SysUserLog> list) {
        return sysUserLogMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SysUserLog> list) {
        return sysUserLogMapper.batchInsert(list);
    }

}
