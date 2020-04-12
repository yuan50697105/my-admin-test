package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service;

import java.util.List;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.CustomerInfo;
public interface CustomerInfoService{


    int updateBatch(List<CustomerInfo> list);

    int updateBatchSelective(List<CustomerInfo> list);

    int batchInsert(List<CustomerInfo> list);

}
