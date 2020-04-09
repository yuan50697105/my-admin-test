package com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.mapper.SysRoleMapper;
import java.util.List;
import com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.pojo.SysRole;
import com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.service.SysRoleService;
@Service
public class SysRoleServiceImpl implements SysRoleService{

    @Resource
    private SysRoleMapper sysRoleMapper;

    @Override
    public int updateBatch(List<SysRole> list) {
        return sysRoleMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SysRole> list) {
        return sysRoleMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SysRole> list) {
        return sysRoleMapper.batchInsert(list);
    }

}
