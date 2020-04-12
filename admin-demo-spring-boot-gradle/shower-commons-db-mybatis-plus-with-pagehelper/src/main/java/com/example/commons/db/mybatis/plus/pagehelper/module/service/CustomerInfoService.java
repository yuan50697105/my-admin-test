package com.example.commons.db.mybatis.plus.pagehelper.module.service;

import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.CustomerInfoExample;
import java.util.List;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.CustomerInfo;
import com.baomidou.mybatisplus.extension.service.IService;
public interface CustomerInfoService extends IService<CustomerInfo>{


    long countByExample(CustomerInfoExample example);

    int deleteByExample(CustomerInfoExample example);

    List<CustomerInfo> selectByExample(CustomerInfoExample example);

    int updateByExampleSelective(CustomerInfo record,CustomerInfoExample example);

    int updateByExample(CustomerInfo record,CustomerInfoExample example);

    int updateBatch(List<CustomerInfo> list);

    int updateBatchSelective(List<CustomerInfo> list);

    int batchInsert(List<CustomerInfo> list);

}
