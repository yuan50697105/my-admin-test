package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service.impl;

import com.example.commons.db.mybatis.mapper.base.sqlhelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.mapper.CustomerInfoMapper;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.CustomerInfo;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.query.CustomerInfoQuery;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service.CustomerInfoService;
import com.example.commons.db.pojo.IPageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomerInfoServiceImpl implements CustomerInfoService {

    @Resource
    private CustomerInfoMapper customerInfoMapper;

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
        return new PageResult<>(new PageInfo<>(customerInfoMapper.selectByExample(query.toExample())));
    }

    @Override
    public List<CustomerInfo> selectByQuery(CustomerInfoQuery query) {
        return customerInfoMapper.selectByExample(query.toExample());
    }

    @Override
    public CustomerInfo selectByPrimaryKey(Long id) {
        return customerInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(CustomerInfo customerInfo) {
        return customerInfoMapper.insert(customerInfo);
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerInfo customerInfo) {
        return customerInfoMapper.updateByPrimaryKeySelective(customerInfo);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return customerInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByPrimaryKeys(List<Long> ids) {
        Example.Builder builder = Example.builder(CustomerInfo.class);
        builder.where(Sqls.custom().andIn("id", ids));
        return customerInfoMapper.deleteByExample(builder);
    }

}
