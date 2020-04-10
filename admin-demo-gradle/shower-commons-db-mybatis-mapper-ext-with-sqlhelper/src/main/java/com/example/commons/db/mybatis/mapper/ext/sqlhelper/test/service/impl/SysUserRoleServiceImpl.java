package com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.pojo.SysUserRole;
import java.util.List;
import com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.mapper.SysUserRoleMapper;
import com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.service.SysUserRoleService;
@Service
public class SysUserRoleServiceImpl implements SysUserRoleService{

    @Resource
    private SysUserRoleMapper sysUserRoleMapper;

    @Override
    public int updateBatch(List<SysUserRole> list) {
        return sysUserRoleMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SysUserRole> list) {
        return sysUserRoleMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SysUserRole> list) {
        return sysUserRoleMapper.batchInsert(list);
    }

}
