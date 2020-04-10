package com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.service.impl;

import com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.mapper.SysPermissionMapper;
import com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.pojo.SysPermission;import com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.service.SysPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;import java.util.List;

@Service
public class SysPermissionServiceImpl implements SysPermissionService {

    @Resource
    private SysPermissionMapper sysPermissionMapper;

    @Override
    public int updateBatch(List<SysPermission> list) {
        return sysPermissionMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SysPermission> list) {
        return sysPermissionMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SysPermission> list) {
        return sysPermissionMapper.batchInsert(list);
    }
}

