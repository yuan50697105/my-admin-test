package com.example.commons.db.mybatis.plus.pagehelper.module.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.GoodsInfo;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.GoodsInfoExample;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.query.GoodsInfoQuery;
import com.example.db.pojo.IPageResult;

import java.util.List;

public interface GoodsInfoService extends IService<GoodsInfo>{


    long countByExample(GoodsInfoExample example);

    int deleteByExample(GoodsInfoExample example);

    List<GoodsInfo> selectByExample(GoodsInfoExample example);

    int updateByExampleSelective(GoodsInfo record,GoodsInfoExample example);

    int updateByExample(GoodsInfo record,GoodsInfoExample example);

    int updateBatch(List<GoodsInfo> list);

    int updateBatchSelective(List<GoodsInfo> list);

    int batchInsert(List<GoodsInfo> list);

    IPageResult<GoodsInfo> selectPageByQuery(GoodsInfoQuery query);

    List<GoodsInfo> selectByQuery(GoodsInfoQuery query);
}
