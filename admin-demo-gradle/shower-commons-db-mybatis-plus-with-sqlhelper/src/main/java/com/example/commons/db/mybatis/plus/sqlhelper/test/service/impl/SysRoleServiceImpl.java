package com.example.commons.db.mybatis.plus.sqlhelper.test.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.example.commons.db.mybatis.plus.sqlhelper.test.mapper.SysRoleMapper;
import com.example.commons.db.mybatis.plus.sqlhelper.test.pojo.SysRoleExample;
import com.example.commons.db.mybatis.plus.sqlhelper.test.pojo.SysRole;
import com.example.commons.db.mybatis.plus.sqlhelper.test.service.SysRoleService;
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService{

    @Override
    public long countByExample(SysRoleExample example) {
        return baseMapper.countByExample(example);
    }
    @Override
    public int deleteByExample(SysRoleExample example) {
        return baseMapper.deleteByExample(example);
    }
    @Override
    public List<SysRole> selectByExample(SysRoleExample example) {
        return baseMapper.selectByExample(example);
    }
    @Override
    public int updateByExampleSelective(SysRole record,SysRoleExample example) {
        return baseMapper.updateByExampleSelective(record,example);
    }
    @Override
    public int updateByExample(SysRole record,SysRoleExample example) {
        return baseMapper.updateByExample(record,example);
    }
    @Override
    public int updateBatch(List<SysRole> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<SysRole> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<SysRole> list) {
        return baseMapper.batchInsert(list);
    }
}
