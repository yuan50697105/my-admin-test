package com.example.commons.db.mybatis.base.pagehelper.module.service.impl;

import com.example.commons.db.mybatis.base.pagehelper.module.mapper.SysDictMapper;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysDict;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysDictExample;
import com.example.commons.db.mybatis.base.pagehelper.module.service.SysDictService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysDictServiceImpl implements SysDictService {

    @Resource
    private SysDictMapper sysDictMapper;

    @Override
    public long countByExample(SysDictExample example) {
        return sysDictMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SysDictExample example) {
        return sysDictMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysDictMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysDict record) {
        return sysDictMapper.insert(record);
    }

    @Override
    public int insertSelective(SysDict record) {
        return sysDictMapper.insertSelective(record);
    }

    @Override
    public List<SysDict> selectByExample(SysDictExample example) {
        return sysDictMapper.selectByExample(example);
    }

    @Override
    public SysDict selectByPrimaryKey(Long id) {
        return sysDictMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(SysDict record, SysDictExample example) {
        return sysDictMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SysDict record, SysDictExample example) {
        return sysDictMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(SysDict record) {
        return sysDictMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysDict record) {
        return sysDictMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<SysDict> list) {
        return sysDictMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SysDict> list) {
        return sysDictMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SysDict> list) {
        return sysDictMapper.batchInsert(list);
    }

    @Override
    public List<SysDict> listByGroupId(Long groupId) {
        SysDictExample example = new SysDictExample();
        example.or().andGroupIdEqualTo(groupId.toString());
        return selectByExample(example);
    }

}
