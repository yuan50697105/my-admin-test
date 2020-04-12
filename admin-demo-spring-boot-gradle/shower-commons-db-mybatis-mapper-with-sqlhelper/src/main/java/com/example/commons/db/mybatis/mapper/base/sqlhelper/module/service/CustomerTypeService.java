package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service;

import java.util.List;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.CustomerType;
public interface CustomerTypeService{


    int updateBatch(List<CustomerType> list);

    int updateBatchSelective(List<CustomerType> list);

    int batchInsert(List<CustomerType> list);

}
