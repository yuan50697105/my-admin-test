package com.example.commons.db.mybatis.plus.sqlhelper.module.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.CustomerInfo;
import java.util.List;
import com.example.commons.db.mybatis.plus.sqlhelper.module.mapper.CustomerInfoMapper;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.CustomerInfoExample;
import com.example.commons.db.mybatis.plus.sqlhelper.module.service.CustomerInfoService;
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
}
