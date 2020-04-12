package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service.impl;

import com.example.commons.db.mybatis.mapper.base.sqlhelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.mapper.CustomerTypeMapper;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.CustomerType;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.query.CustomerTypeQuery;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service.CustomerTypeService;
import com.example.db.pojo.IPageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {

    @Resource
    private CustomerTypeMapper customerTypeMapper;

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

    @Override
    public IPageResult<CustomerType> selectPageByQuery(CustomerTypeQuery query) {
        PageHelper.startPage(query.getPage(), query.getSize());
        return new PageResult<>(new PageInfo<>(customerTypeMapper.selectByExample(query.toExample())));
    }

    @Override
    public List<CustomerType> selectByQuery(CustomerTypeQuery query) {
        return customerTypeMapper.selectByExample(query.toExample());
    }

    @Override
    public CustomerType selectByPrimaryKey(Long id) {
        return customerTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(CustomerType customerType) {
        return customerTypeMapper.insert(customerType);
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerType customerType) {
        return customerTypeMapper.updateByPrimaryKeySelective(customerType);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return customerTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByPrimaryKeys(List<Long> ids) {
        Example.Builder builder = Example.builder(CustomerType.class);
        builder.where(Sqls.custom().andIn("id", ids));
        return customerTypeMapper.deleteByExample(builder.build());
    }

}
