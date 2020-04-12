package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service;

import java.util.List;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.GoodsInfo;
public interface GoodsInfoService{


    int updateBatch(List<GoodsInfo> list);

    int updateBatchSelective(List<GoodsInfo> list);

    int batchInsert(List<GoodsInfo> list);

}
