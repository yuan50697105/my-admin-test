package com.example.commons.db.mybatis.base.pagehelper.module.service.impl;

import com.example.commons.db.mybatis.base.pagehelper.module.mapper.SysDictGroupMapper;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysDictGroup;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysDictGroupExample;
import com.example.commons.db.mybatis.base.pagehelper.module.service.SysDictGroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysDictGroupServiceImpl implements SysDictGroupService {

    @Resource
    private SysDictGroupMapper sysDictGroupMapper;

    @Override
    public long countByExample(SysDictGroupExample example) {
        return sysDictGroupMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SysDictGroupExample example) {
        return sysDictGroupMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysDictGroupMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysDictGroup record) {
        return sysDictGroupMapper.insert(record);
    }

    @Override
    public int insertSelective(SysDictGroup record) {
        return sysDictGroupMapper.insertSelective(record);
    }

    @Override
    public List<SysDictGroup> selectByExample(SysDictGroupExample example) {
        return sysDictGroupMapper.selectByExample(example);
    }

    @Override
    public SysDictGroup selectByPrimaryKey(Long id) {
        return sysDictGroupMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(SysDictGroup record, SysDictGroupExample example) {
        return sysDictGroupMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SysDictGroup record, SysDictGroupExample example) {
        return sysDictGroupMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(SysDictGroup record) {
        return sysDictGroupMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysDictGroup record) {
        return sysDictGroupMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<SysDictGroup> list) {
        return sysDictGroupMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SysDictGroup> list) {
        return sysDictGroupMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SysDictGroup> list) {
        return sysDictGroupMapper.batchInsert(list);
    }

    @Override
    public SysDictGroup getByKey(String group) {
        SysDictGroupExample example = new SysDictGroupExample();
        example.or().andKeyEqualTo(group);
        try {
            return selectByExample(example).get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
