package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.mapper.CustomerInfoMapper;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.CustomerInfo;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service.CustomerInfoService;
@Service
public class CustomerInfoServiceImpl implements CustomerInfoService{

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

}
