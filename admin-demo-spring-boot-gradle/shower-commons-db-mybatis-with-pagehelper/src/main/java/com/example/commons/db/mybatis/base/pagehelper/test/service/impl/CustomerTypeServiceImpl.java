package com.example.commons.db.mybatis.base.pagehelper.test.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.CustomerType;
import java.util.List;
import com.example.commons.db.mybatis.base.pagehelper.test.mapper.CustomerTypeMapper;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.CustomerTypeExample;
import com.example.commons.db.mybatis.base.pagehelper.test.service.CustomerTypeService;
@Service
public class CustomerTypeServiceImpl implements CustomerTypeService{

    @Resource
    private CustomerTypeMapper customerTypeMapper;

    @Override
    public long countByExample(CustomerTypeExample example) {
        return customerTypeMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CustomerTypeExample example) {
        return customerTypeMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return customerTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CustomerType record) {
        return customerTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(CustomerType record) {
        return customerTypeMapper.insertSelective(record);
    }

    @Override
    public List<CustomerType> selectByExample(CustomerTypeExample example) {
        return customerTypeMapper.selectByExample(example);
    }

    @Override
    public CustomerType selectByPrimaryKey(Long id) {
        return customerTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(CustomerType record,CustomerTypeExample example) {
        return customerTypeMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(CustomerType record,CustomerTypeExample example) {
        return customerTypeMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerType record) {
        return customerTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CustomerType record) {
        return customerTypeMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<CustomerType> list) {
        return customerTypeMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<CustomerType> list) {
        return customerTypeMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<CustomerType> list) {
        return customerTypeMapper.batchInsert(list);
    }

}
