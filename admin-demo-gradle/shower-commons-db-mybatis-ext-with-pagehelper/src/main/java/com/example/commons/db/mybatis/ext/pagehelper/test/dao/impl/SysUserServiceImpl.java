package com.example.commons.db.mybatis.ext.pagehelper.test.dao.impl;

import com.example.commons.db.mybatis.ext.pagehelper.pojo.PageResult;
import com.example.commons.db.mybatis.ext.pagehelper.test.dao.SysUserService;
import com.example.commons.db.mybatis.ext.pagehelper.test.mapper.SysUserMapper;
import com.example.commons.db.mybatis.ext.pagehelper.test.pojo.SysUser;
import com.example.commons.db.mybatis.ext.pagehelper.test.pojo.SysUserExample;
import com.example.commons.db.mybatis.ext.pagehelper.test.pojo.SysUserQuery;
import com.example.commons.db.pojo.IPageResult;
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
    public List<SysUser> selectListByQuery(SysUserQuery query) {
        return sysUserMapper.selectByExample(query.toExample());
    }

    @Override
    public IPageResult<SysUser> selectPageByExample(SysUserExample example, int page, int size) {
        PageHelper.startPage(page, size);
        List<SysUser> list = sysUserMapper.selectByExample(example);
        PageInfo<SysUser> pageInfo = new PageInfo<>(list);
        return new PageResult<>(pageInfo);
    }

    @Override
    public IPageResult<SysUser> selectPageByQuery(SysUserQuery query) {
        PageHelper.startPage(query.getPage(), query.getSize());
        List<SysUser> list = sysUserMapper.selectByExample(query.toExample());
        PageInfo<SysUser> pageInfo = new PageInfo<>(list);
        return new PageResult<>(pageInfo);
    }

}
