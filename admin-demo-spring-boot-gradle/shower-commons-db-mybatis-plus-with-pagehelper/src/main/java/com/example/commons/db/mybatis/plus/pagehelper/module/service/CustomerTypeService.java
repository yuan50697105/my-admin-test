package com.example.commons.db.mybatis.plus.pagehelper.module.service;

import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.CustomerType;
import java.util.List;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.CustomerTypeExample;
import com.baomidou.mybatisplus.extension.service.IService;
public interface CustomerTypeService extends IService<CustomerType>{


    long countByExample(CustomerTypeExample example);

    int deleteByExample(CustomerTypeExample example);

    List<CustomerType> selectByExample(CustomerTypeExample example);

    int updateByExampleSelective(CustomerType record,CustomerTypeExample example);

    int updateByExample(CustomerType record,CustomerTypeExample example);

    int updateBatch(List<CustomerType> list);

    int updateBatchSelective(List<CustomerType> list);

    int batchInsert(List<CustomerType> list);

}
