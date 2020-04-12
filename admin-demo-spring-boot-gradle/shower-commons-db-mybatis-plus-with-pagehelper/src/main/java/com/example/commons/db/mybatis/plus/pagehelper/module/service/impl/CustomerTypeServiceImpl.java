package com.example.commons.db.mybatis.plus.pagehelper.module.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.commons.db.mybatis.plus.pagehelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.plus.pagehelper.module.mapper.CustomerTypeMapper;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.CustomerType;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.CustomerTypeExample;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.query.CustomerTypeQuery;
import com.example.commons.db.mybatis.plus.pagehelper.module.service.CustomerTypeService;
import com.example.db.pojo.IPageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeServiceImpl extends ServiceImpl<CustomerTypeMapper, CustomerType> implements CustomerTypeService {

    @Override
    public long countByExample(CustomerTypeExample example) {
        return baseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CustomerTypeExample example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public List<CustomerType> selectByExample(CustomerTypeExample example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(CustomerType record, CustomerTypeExample example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(CustomerType record, CustomerTypeExample example) {
        return baseMapper.updateByExample(record, example);
    }

    @Override
    public int updateBatch(List<CustomerType> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<CustomerType> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<CustomerType> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public IPageResult<CustomerType> selectPageByQuery(CustomerTypeQuery query) {
        PageHelper.startPage(query.getPage(), query.getSize());
        return new PageResult<>(new PageInfo<>(baseMapper.selectByExample(query.toExample())));
    }

    @Override
    public List<CustomerType> selectByQuery(CustomerTypeQuery query) {
        return baseMapper.selectByExample(query.toExample());
    }
}
