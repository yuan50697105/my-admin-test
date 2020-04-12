package com.example.commons.db.mybatis.base.pagehelper.module.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceOrderInfo;
import java.util.List;
import com.example.commons.db.mybatis.base.pagehelper.module.mapper.ServiceOrderInfoMapper;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceOrderInfoExample;
import com.example.commons.db.mybatis.base.pagehelper.module.service.impl.ServiceOrderInfoService;
@Service
public class ServiceOrderInfoServiceImpl implements ServiceOrderInfoService{

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
    public int updateByExampleSelective(ServiceOrderInfo record,ServiceOrderInfoExample example) {
        return serviceOrderInfoMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(ServiceOrderInfo record,ServiceOrderInfoExample example) {
        return serviceOrderInfoMapper.updateByExample(record,example);
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

}
