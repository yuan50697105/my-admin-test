package com.example.commons.db.mybatis.base.pagehelper.module.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceOrderItem;
import com.example.commons.db.mybatis.base.pagehelper.module.mapper.ServiceOrderItemMapper;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceOrderItemExample;
import com.example.commons.db.mybatis.base.pagehelper.module.service.impl.ServiceOrderItemService;
@Service
public class ServiceOrderItemServiceImpl implements ServiceOrderItemService{

    @Resource
    private ServiceOrderItemMapper serviceOrderItemMapper;

    @Override
    public long countByExample(ServiceOrderItemExample example) {
        return serviceOrderItemMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ServiceOrderItemExample example) {
        return serviceOrderItemMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return serviceOrderItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ServiceOrderItem record) {
        return serviceOrderItemMapper.insert(record);
    }

    @Override
    public int insertSelective(ServiceOrderItem record) {
        return serviceOrderItemMapper.insertSelective(record);
    }

    @Override
    public List<ServiceOrderItem> selectByExample(ServiceOrderItemExample example) {
        return serviceOrderItemMapper.selectByExample(example);
    }

    @Override
    public ServiceOrderItem selectByPrimaryKey(Long id) {
        return serviceOrderItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(ServiceOrderItem record,ServiceOrderItemExample example) {
        return serviceOrderItemMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(ServiceOrderItem record,ServiceOrderItemExample example) {
        return serviceOrderItemMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(ServiceOrderItem record) {
        return serviceOrderItemMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ServiceOrderItem record) {
        return serviceOrderItemMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<ServiceOrderItem> list) {
        return serviceOrderItemMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<ServiceOrderItem> list) {
        return serviceOrderItemMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<ServiceOrderItem> list) {
        return serviceOrderItemMapper.batchInsert(list);
    }

}
