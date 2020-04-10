package com.example.commons.db.mybatis.mapper.base.pagehelper.test.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.example.commons.db.mybatis.mapper.base.pagehelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.mapper.base.pagehelper.test.mapper.SysUserMapper;
import com.example.commons.db.mybatis.mapper.base.pagehelper.test.pojo.SysUser;
import com.example.commons.db.mybatis.mapper.base.pagehelper.test.pojo.query.SysUserQuery;
import com.example.commons.db.mybatis.mapper.base.pagehelper.test.service.SysUserService;
import com.example.commons.db.pojo.IPageResult;
import com.example.commons.db.utils.DbUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SysUserServiceImpl implements SysUserService{

    @Resource
    private SysUserMapper sysUserMapper;

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
    public int insert(SysUser sysUser) {
        return sysUserMapper.insert(sysUser);
    }

    @Override
    public SysUser selectByPrimaryKey(Long id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser sysUser) {
        return sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByIds(List<Long> ids) {
        Example example = new Example(SysUser.class);
        example.and().andIn("id", ids);
        return sysUserMapper.deleteByExample(example);
    }

    @Override
    public IPageResult<SysUser> selectPageByQuery(SysUserQuery query) {
        PageHelper.startPage(query.getPage(), query.getSize());
        Example example = createExample(query);
        return new PageResult<>(new PageInfo<>(sysUserMapper.selectByExample(example)));
    }

    @Override
    public List<SysUser> selectByQuery(SysUserQuery query) {
        return sysUserMapper.selectByExample(createExample(query));
    }

    @Override
    public boolean existByUsername(String username) {
        Example example = new Example(SysUser.class);
        example.and().andEqualTo("username", username);
        return sysUserMapper.selectCountByExample(example)>0;
    }

    public Example createExample(SysUserQuery query) {
        Example example = new Example(SysUser.class);
        if (ObjectUtil.isNotEmpty(query.getName())) {
            example.and().andLike("name", DbUtils.likeContains(query.getName()));
        }
        return example;
    }

}
