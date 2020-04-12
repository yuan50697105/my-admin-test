package com.example.commons.db.mybatis.plus.sqlhelper.module.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.SysUserRole;
import com.example.commons.db.mybatis.plus.sqlhelper.module.mapper.SysUserRoleMapper;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.SysUserRoleExample;
import com.example.commons.db.mybatis.plus.sqlhelper.module.service.SysUserRoleService;
@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements SysUserRoleService{

    @Override
    public long countByExample(SysUserRoleExample example) {
        return baseMapper.countByExample(example);
    }
    @Override
    public int deleteByExample(SysUserRoleExample example) {
        return baseMapper.deleteByExample(example);
    }
    @Override
    public List<SysUserRole> selectByExample(SysUserRoleExample example) {
        return baseMapper.selectByExample(example);
    }
    @Override
    public int updateByExampleSelective(SysUserRole record,SysUserRoleExample example) {
        return baseMapper.updateByExampleSelective(record,example);
    }
    @Override
    public int updateByExample(SysUserRole record,SysUserRoleExample example) {
        return baseMapper.updateByExample(record,example);
    }
    @Override
    public int updateBatch(List<SysUserRole> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<SysUserRole> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<SysUserRole> list) {
        return baseMapper.batchInsert(list);
    }
}
