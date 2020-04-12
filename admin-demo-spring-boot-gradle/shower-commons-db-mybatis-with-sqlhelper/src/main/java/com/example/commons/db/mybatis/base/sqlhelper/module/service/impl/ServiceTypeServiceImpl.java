package com.example.commons.db.mybatis.base.sqlhelper.module.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.commons.db.mybatis.base.sqlhelper.module.mapper.ServiceTypeMapper;
import com.example.commons.db.mybatis.base.sqlhelper.module.pojo.ServiceType;
import java.util.List;
import com.example.commons.db.mybatis.base.sqlhelper.module.pojo.ServiceTypeExample;
import com.example.commons.db.mybatis.base.sqlhelper.module.service.ServiceTypeService;
@Service
public class ServiceTypeServiceImpl implements ServiceTypeService{

    @Resource
    private ServiceTypeMapper serviceTypeMapper;

    @Override
    public long countByExample(ServiceTypeExample example) {
        return serviceTypeMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ServiceTypeExample example) {
        return serviceTypeMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return serviceTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ServiceType record) {
        return serviceTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(ServiceType record) {
        return serviceTypeMapper.insertSelective(record);
    }

    @Override
    public List<ServiceType> selectByExample(ServiceTypeExample example) {
        return serviceTypeMapper.selectByExample(example);
    }

    @Override
    public ServiceType selectByPrimaryKey(Long id) {
        return serviceTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(ServiceType record,ServiceTypeExample example) {
        return serviceTypeMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(ServiceType record,ServiceTypeExample example) {
        return serviceTypeMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(ServiceType record) {
        return serviceTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ServiceType record) {
        return serviceTypeMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<ServiceType> list) {
        return serviceTypeMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<ServiceType> list) {
        return serviceTypeMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<ServiceType> list) {
        return serviceTypeMapper.batchInsert(list);
    }

}
