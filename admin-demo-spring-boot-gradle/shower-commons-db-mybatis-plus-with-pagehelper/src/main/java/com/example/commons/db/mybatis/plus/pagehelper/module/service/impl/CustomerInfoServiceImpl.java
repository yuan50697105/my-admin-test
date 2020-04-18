package com.example.commons.db.mybatis.plus.pagehelper.module.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.commons.db.mybatis.plus.pagehelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.plus.pagehelper.module.mapper.CustomerInfoMapper;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.CustomerInfo;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.CustomerInfoExample;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.query.CustomerInfoQuery;
import com.example.commons.db.mybatis.plus.pagehelper.module.service.CustomerInfoService;
import com.example.commons.db.pojo.IPageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerInfoServiceImpl extends ServiceImpl<CustomerInfoMapper, CustomerInfo> implements CustomerInfoService{

    @Override
    public long countByExample(CustomerInfoExample example) {
        return baseMapper.countByExample(example);
    }
    @Override
    public int deleteByExample(CustomerInfoExample example) {
        return baseMapper.deleteByExample(example);
    }
    @Override
    public List<CustomerInfo> selectByExample(CustomerInfoExample example) {
        return baseMapper.selectByExample(example);
    }
    @Override
    public int updateByExampleSelective(CustomerInfo record,CustomerInfoExample example) {
        return baseMapper.updateByExampleSelective(record,example);
    }
    @Override
    public int updateByExample(CustomerInfo record,CustomerInfoExample example) {
        return baseMapper.updateByExample(record,example);
    }
    @Override
    public int updateBatch(List<CustomerInfo> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<CustomerInfo> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<CustomerInfo> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public IPageResult<CustomerInfo> selectPageByQuery(CustomerInfoQuery query) {
        PageHelper.startPage(query.getPage(), query.getSize());
        return new PageResult<>(new PageInfo<>(baseMapper.selectByExample(query.toExample())));
    }

    @Override
    public List<CustomerInfo> selectByQuery(CustomerInfoQuery query) {
        return baseMapper.selectByExample(query.toExample());
    }
}
