package org.yuan.admin.db.modules.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.admin.commons.entity.IPageResult;
import org.yuan.admin.db.commons.entity.PageResult;
import org.yuan.admin.db.modules.entity.SysUser;
import org.yuan.admin.db.modules.entity.SysUserExample;
import org.yuan.admin.db.modules.entity.SysUserQuery;
import org.yuan.admin.db.modules.mapper.SysUserMapper;
import org.yuan.admin.db.modules.service.SysUserService;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
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
    public IPageResult<SysUser> selectPageByExample(int page, int pageSize, SysUserExample example) {
        PageHelper.startPage(page, pageSize);
        return new PageResult<>(new PageInfo<>(sysUserMapper.selectByExample(example)));
    }

    @Override
    public IPageResult<SysUser> selectPageByQuery(SysUserQuery query) {
        return selectPageByExample(query.getPage(), query.getSize(), query.toExample());
    }

    @Override
    public List<SysUser> selectByQuery(SysUserQuery query) {
        return selectByExample(query.toExample());
    }
}
