package com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.service.impl;

import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.mapper.SysUserRoleMapper;
import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.pojo.SysUserRole;
import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.pojo.SysUserRoleExample;
import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.repository.SysUserRoleRepository;
import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.service.SysUserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserRoleServiceImpl implements SysUserRoleService {
    @Resource
    private SysUserRoleRepository sysUserRoleRepository;
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

    @Override
    public int deleteByRoleId(Long roleId) {
        SysUserRoleExample example = new SysUserRoleExample();
        example.or().andRoleIdEqualTo(roleId);
        return deleteByExample(example);
    }

    @Override
    public int deleteByRoleIds(List<Long> roleIds) {
        SysUserRoleExample example = new SysUserRoleExample();
        example.or().andRoleIdIn(roleIds);
        return deleteByExample(example);
    }

    @Override
    public int deleteByUserId(Long userId) {
        SysUserRoleExample example = new SysUserRoleExample();
        example.or().andUserIdEqualTo(userId);
        return deleteByExample(example);
    }

    @Override
    public int deleteByUserIds(List<Long> userIds) {
        SysUserRoleExample example = new SysUserRoleExample();
        example.or().andUserIdIn(userIds);
        return deleteByExample(example);
    }

}
