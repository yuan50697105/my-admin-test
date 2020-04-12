package com.example.commons.db.mybatis.plus.sqlhelper.module.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.CustomerType;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.CustomerTypeExample;
import com.example.commons.db.mybatis.plus.sqlhelper.module.mapper.CustomerTypeMapper;
import com.example.commons.db.mybatis.plus.sqlhelper.module.service.CustomerTypeService;
@Service
public class CustomerTypeServiceImpl extends ServiceImpl<CustomerTypeMapper, CustomerType> implements CustomerTypeService{

    @Override
    public long countByExample(CustomerTypeExample example) {
        return baseMapper.countByExample(example);
    }
    @Override
    public int deleteByExample(CustomerTypeExample example) {
        return baseMapper.deleteByExample(example);
    }
    @Override
    public List<CustomerType> selectByExample(CustomerTypeExample example) {
        return baseMapper.selectByExample(example);
    }
    @Override
    public int updateByExampleSelective(CustomerType record,CustomerTypeExample example) {
        return baseMapper.updateByExampleSelective(record,example);
    }
    @Override
    public int updateByExample(CustomerType record,CustomerTypeExample example) {
        return baseMapper.updateByExample(record,example);
    }
    @Override
    public int updateBatch(List<CustomerType> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<CustomerType> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<CustomerType> list) {
        return baseMapper.batchInsert(list);
    }
}
