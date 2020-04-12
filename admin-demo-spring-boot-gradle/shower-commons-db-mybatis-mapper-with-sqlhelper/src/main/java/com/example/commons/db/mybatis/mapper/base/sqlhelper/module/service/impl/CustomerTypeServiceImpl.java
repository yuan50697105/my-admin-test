package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.mapper.CustomerTypeMapper;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.CustomerType;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service.CustomerTypeService;
@Service
public class CustomerTypeServiceImpl implements CustomerTypeService{

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

}
