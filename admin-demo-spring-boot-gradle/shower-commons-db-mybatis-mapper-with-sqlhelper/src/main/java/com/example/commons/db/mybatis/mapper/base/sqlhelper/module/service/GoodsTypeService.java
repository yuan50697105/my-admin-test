package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service;

import java.util.List;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.GoodsType;
public interface GoodsTypeService{


    int updateBatch(List<GoodsType> list);

    int updateBatchSelective(List<GoodsType> list);

    int batchInsert(List<GoodsType> list);

}
