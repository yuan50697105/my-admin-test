package com.example.commons.db.mybatis.mapper.base.pagehelper.module.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.commons.db.mybatis.mapper.base.pagehelper.module.mapper.SysUserLogMapper;
import com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.SysUserLog;
import com.example.commons.db.mybatis.mapper.base.pagehelper.module.service.SysUserLogService;

@Service
public class SysUserLogServiceImpl implements SysUserLogService {

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

