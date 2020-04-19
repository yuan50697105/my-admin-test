package com.example.commons.db.mybatis.base.pagehelper.module.service.impl;

import com.example.commons.db.mybatis.base.pagehelper.module.mapper.ServiceInfoMapper;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceInfo;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceInfoExample;
import com.example.commons.db.mybatis.base.pagehelper.module.service.ServiceInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ServiceInfoServiceImpl implements ServiceInfoService {

    @Resource
    private ServiceInfoMapper serviceInfoMapper;

    @Override
    public long countByExample(ServiceInfoExample example) {
        return serviceInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ServiceInfoExample example) {
        return serviceInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return serviceInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ServiceInfo record) {
        return serviceInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(ServiceInfo record) {
        return serviceInfoMapper.insertSelective(record);
    }

    @Override
    public List<ServiceInfo> selectByExample(ServiceInfoExample example) {
        return serviceInfoMapper.selectByExample(example);
    }

    @Override
    public ServiceInfo selectByPrimaryKey(Long id) {
        return serviceInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(ServiceInfo record, ServiceInfoExample example) {
        return serviceInfoMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(ServiceInfo record, ServiceInfoExample example) {
        return serviceInfoMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(ServiceInfo record) {
        return serviceInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ServiceInfo record) {
        return serviceInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<ServiceInfo> list) {
        return serviceInfoMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<ServiceInfo> list) {
        return serviceInfoMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<ServiceInfo> list) {
        return serviceInfoMapper.batchInsert(list);
    }

}



