package com.example.commons.db.mybatis.jpa.base.pagehelper.module.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.SysUserRoleExample;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.mapper.SysUserRoleMapper;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.SysUserRole;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.service.SysUserRoleService;
@Service
public class SysUserRoleServiceImpl implements SysUserRoleService{

    @Resource
    private SysUserRoleMapper sysUserRoleMapper;

    @Override
    public long countByExample(SysUserRoleExample example) {
        return sysUserRoleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SysUserRoleExample example) {
        return sysUserRoleMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysUserRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysUserRole record) {
        return sysUserRoleMapper.insert(record);
    }

    @Override
    public int insertSelective(SysUserRole record) {
        return sysUserRoleMapper.insertSelective(record);
    }

    @Override
    public List<SysUserRole> selectByExample(SysUserRoleExample example) {
        return sysUserRoleMapper.selectByExample(example);
    }

    @Override
    public SysUserRole selectByPrimaryKey(Long id) {
        return sysUserRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(SysUserRole record,SysUserRoleExample example) {
        return sysUserRoleMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(SysUserRole record,SysUserRoleExample example) {
        return sysUserRoleMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(SysUserRole record) {
        return sysUserRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysUserRole record) {
        return sysUserRoleMapper.updateByPrimaryKey(record);
    }

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
