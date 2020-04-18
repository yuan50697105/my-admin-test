package com.example.commons.db.mybatis.plus.sqlhelper.module.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.GoodsType;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.GoodsTypeExample;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.query.GoodsTypeQuery;
import com.example.commons.db.pojo.IPageResult;

import java.util.List;

public interface GoodsTypeService extends IService<GoodsType>{


    long countByExample(GoodsTypeExample example);

    int deleteByExample(GoodsTypeExample example);

    List<GoodsType> selectByExample(GoodsTypeExample example);

    int updateByExampleSelective(GoodsType record,GoodsTypeExample example);

    int updateByExample(GoodsType record,GoodsTypeExample example);

    int updateBatch(List<GoodsType> list);

    int updateBatchSelective(List<GoodsType> list);

    int batchInsert(List<GoodsType> list);

    IPageResult<GoodsType> selectPageByQuery(GoodsTypeQuery query);

    List<GoodsType> selectByQuery(GoodsTypeQuery query);
}
