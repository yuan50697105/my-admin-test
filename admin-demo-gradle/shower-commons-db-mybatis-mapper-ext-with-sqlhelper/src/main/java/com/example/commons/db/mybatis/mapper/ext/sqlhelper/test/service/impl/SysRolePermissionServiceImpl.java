package com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.pojo.SysRolePermission;
import com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.mapper.SysRolePermissionMapper;
import com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.service.SysRolePermissionService;
@Service
public class SysRolePermissionServiceImpl implements SysRolePermissionService{

    @Resource
    private SysRolePermissionMapper sysRolePermissionMapper;

    @Override
    public int updateBatch(List<SysRolePermission> list) {
        return sysRolePermissionMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SysRolePermission> list) {
        return sysRolePermissionMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SysRolePermission> list) {
        return sysRolePermissionMapper.batchInsert(list);
    }

}
