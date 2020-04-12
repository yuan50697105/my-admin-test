package com.example.commons.db.mybatis.jpa.base.sqlhelper.module.service.impl;

import com.example.commons.db.mybatis.jpa.base.sqlhelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.jpa.base.sqlhelper.module.mapper.CustomerInfoMapper;
import com.example.commons.db.mybatis.jpa.base.sqlhelper.module.pojo.CustomerInfo;
import com.example.commons.db.mybatis.jpa.base.sqlhelper.module.pojo.CustomerInfoExample;
import com.example.commons.db.mybatis.jpa.base.sqlhelper.module.pojo.query.CustomerInfoQuery;
import com.example.commons.db.mybatis.jpa.base.sqlhelper.module.repository.CustomerInfoRepository;
import com.example.commons.db.mybatis.jpa.base.sqlhelper.module.service.CustomerInfoService;
import com.example.db.pojo.IPageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomerInfoServiceImpl implements CustomerInfoService {
    @Resource
    private CustomerInfoRepository customerInfoRepository;
    @Resource
    private CustomerInfoMapper customerInfoMapper;

    @Override
    public long countByExample(CustomerInfoExample example) {
        return customerInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CustomerInfoExample example) {
        return customerInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return customerInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CustomerInfo record) {
        return customerInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(CustomerInfo record) {
        return customerInfoMapper.insertSelective(record);
    }

    @Override
    public List<CustomerInfo> selectByExample(CustomerInfoExample example) {
        return customerInfoMapper.selectByExample(example);
    }

    @Override
    public CustomerInfo selectByPrimaryKey(Long id) {
        return customerInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(CustomerInfo record,CustomerInfoExample example) {
        return customerInfoMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(CustomerInfo record,CustomerInfoExample example) {
        return customerInfoMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerInfo record) {
        return customerInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CustomerInfo record) {
        return customerInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CustomerInfo> list) {
        return customerInfoMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<CustomerInfo> list) {
        return customerInfoMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<CustomerInfo> list) {
        return customerInfoMapper.batchInsert(list);
    }

    @Override
    public IPageResult<CustomerInfo> selectPageByQuery(CustomerInfoQuery query) {
        PageHelper.startPage(query.getPage(), query.getSize());
        return new PageResult<>(new PageInfo<>(selectByExample(query.toExample())));
    }

    @Override
    public List<CustomerInfo> selectByQuery(CustomerInfoQuery query) {
        return selectByExample(query.toExample());
    }

    @Override
    public int deleteByPrimaryKeys(List<Long> ids) {
        CustomerInfoExample example = new CustomerInfoExample();
        example.or().andIdIn(ids);
        return deleteByExample(example);
    }

}
