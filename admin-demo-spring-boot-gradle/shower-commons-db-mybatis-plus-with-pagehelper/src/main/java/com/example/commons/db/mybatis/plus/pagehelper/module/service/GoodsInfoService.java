package com.example.commons.db.mybatis.plus.pagehelper.module.service;

import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.GoodsInfo;
import java.util.List;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.GoodsInfoExample;
import com.baomidou.mybatisplus.extension.service.IService;
public interface GoodsInfoService extends IService<GoodsInfo>{


    long countByExample(GoodsInfoExample example);

    int deleteByExample(GoodsInfoExample example);

    List<GoodsInfo> selectByExample(GoodsInfoExample example);

    int updateByExampleSelective(GoodsInfo record,GoodsInfoExample example);

    int updateByExample(GoodsInfo record,GoodsInfoExample example);

    int updateBatch(List<GoodsInfo> list);

    int updateBatchSelective(List<GoodsInfo> list);

    int batchInsert(List<GoodsInfo> list);

}
