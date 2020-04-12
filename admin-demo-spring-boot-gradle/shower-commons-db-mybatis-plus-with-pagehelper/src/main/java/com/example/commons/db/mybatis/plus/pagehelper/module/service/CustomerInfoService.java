package com.example.commons.db.mybatis.plus.pagehelper.module.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.CustomerInfo;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.CustomerInfoExample;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.query.CustomerInfoQuery;
import com.example.db.pojo.IPageResult;

import java.util.List;

public interface CustomerInfoService extends IService<CustomerInfo>{


    long countByExample(CustomerInfoExample example);

    int deleteByExample(CustomerInfoExample example);

    List<CustomerInfo> selectByExample(CustomerInfoExample example);

    int updateByExampleSelective(CustomerInfo record,CustomerInfoExample example);

    int updateByExample(CustomerInfo record,CustomerInfoExample example);

    int updateBatch(List<CustomerInfo> list);

    int updateBatchSelective(List<CustomerInfo> list);

    int batchInsert(List<CustomerInfo> list);

    IPageResult<CustomerInfo> selectPageByQuery(CustomerInfoQuery query);

    List<CustomerInfo> selectByQuery(CustomerInfoQuery query);
}
