package com.example.commons.db.mybatis.base.sqlhelper.module.service.impl;

import com.example.commons.db.mybatis.base.sqlhelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.base.sqlhelper.module.mapper.ServiceOrderInfoMapper;
import com.example.commons.db.mybatis.base.sqlhelper.module.pojo.ServiceOrderInfo;
import com.example.commons.db.mybatis.base.sqlhelper.module.pojo.ServiceOrderInfoExample;
import com.example.commons.db.mybatis.base.sqlhelper.module.pojo.query.ServiceOrderInfoQuery;
import com.example.commons.db.mybatis.base.sqlhelper.module.service.ServiceOrderInfoService;
import com.example.commons.db.pojo.IPageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ServiceOrderInfoServiceImpl implements ServiceOrderInfoService {

    @Resource
    private ServiceOrderInfoMapper serviceOrderInfoMapper;

    @Override
    public long countByExample(ServiceOrderInfoExample example) {
        return serviceOrderInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ServiceOrderInfoExample example) {
        return serviceOrderInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return serviceOrderInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ServiceOrderInfo record) {
        return serviceOrderInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(ServiceOrderInfo record) {
        return serviceOrderInfoMapper.insertSelective(record);
    }

    @Override
    public List<ServiceOrderInfo> selectByExample(ServiceOrderInfoExample example) {
        return serviceOrderInfoMapper.selectByExample(example);
    }

    @Override
    public ServiceOrderInfo selectByPrimaryKey(Long id) {
        return serviceOrderInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(ServiceOrderInfo record, ServiceOrderInfoExample example) {
        return serviceOrderInfoMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(ServiceOrderInfo record, ServiceOrderInfoExample example) {
        return serviceOrderInfoMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(ServiceOrderInfo record) {
        return serviceOrderInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ServiceOrderInfo record) {
        return serviceOrderInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<ServiceOrderInfo> list) {
        return serviceOrderInfoMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<ServiceOrderInfo> list) {
        return serviceOrderInfoMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<ServiceOrderInfo> list) {
        return serviceOrderInfoMapper.batchInsert(list);
    }

    @Override
    public IPageResult<ServiceOrderInfo> selectPageByQuery(ServiceOrderInfoQuery query) {
        PageHelper.startPage(query.getPage(), query.getSize());
        return new PageResult<>(new PageInfo<>(selectByExample(query.toExample())));
    }

    @Override
    public List<ServiceOrderInfo> selectByQuery(ServiceOrderInfoQuery query) {
        return selectByExample(query.toExample());
    }

    @Override
    public List<ServiceOrderInfo> selectByPrimaryKeys(List<Long> ids) {
        ServiceOrderInfoExample example = new ServiceOrderInfoExample();
        example.or().andIdIn(ids);
        return selectByExample(example);
    }

}
