package com.example.commons.db.mybatis.base.pagehelper.module.service.impl;

import com.example.commons.db.mybatis.base.pagehelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.base.pagehelper.module.mapper.SysUserMapper;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysUser;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysUserExample;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.query.SysUserQuery;
import com.example.commons.db.mybatis.base.pagehelper.module.service.SysUserService;
import com.example.db.pojo.IPageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public long countByExample(SysUserExample example) {
        return sysUserMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SysUserExample example) {
        return sysUserMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByPrimaryKeys(List<Long> ids) {
        SysUserExample example = new SysUserExample();
        example.or().andIdIn(ids);
        return deleteByExample(example);
    }

    @Override
    public int insert(SysUser record) {
        return sysUserMapper.insert(record);
    }

    @Override
    public int insertSelective(SysUser record) {
        return sysUserMapper.insertSelective(record);
    }

    @Override
    public List<SysUser> selectByExample(SysUserExample example) {
        return sysUserMapper.selectByExample(example);
    }

    @Override
    public SysUser selectByPrimaryKey(Long id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(SysUser record, SysUserExample example) {
        return sysUserMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SysUser record, SysUserExample example) {
        return sysUserMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser record) {
        return sysUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysUser record) {
        return sysUserMapper.updateByPrimaryKey(record);
    }

    @Override
    public IPageResult<SysUser> selectPageByQuery(SysUserQuery query) {
        SysUserExample example = query.toExample();
        return selectPageByExample(example, query.getPage(), query.getSize());
    }

    @Override
    public IPageResult<SysUser> selectPageByExample(SysUserExample example, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageResult<>(new PageInfo<>(selectByExample(example)));
    }

    @Override
    public List<SysUser> selectByQuery(SysUserQuery query) {
        SysUserExample example = query.toExample();
        return selectByExample(example);
    }

    @Override
    public int updateBatch(List<SysUser> list) {
        return sysUserMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SysUser> list) {
        return sysUserMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SysUser> list) {
        return sysUserMapper.batchInsert(list);
    }

    @Override
    public boolean existByUsername(String username) {
        SysUserExample example = new SysUserExample();
        example.or().andUsernameEqualTo(username);
        return sysUserMapper.countByExample(example) > 0;
    }

}






