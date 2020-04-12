package com.example.commons.db.mybatis.plus.pagehelper.module.service;

import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.GoodsTypeExample;
import java.util.List;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.GoodsType;
import com.baomidou.mybatisplus.extension.service.IService;
public interface GoodsTypeService extends IService<GoodsType>{


    long countByExample(GoodsTypeExample example);

    int deleteByExample(GoodsTypeExample example);

    List<GoodsType> selectByExample(GoodsTypeExample example);

    int updateByExampleSelective(GoodsType record,GoodsTypeExample example);

    int updateByExample(GoodsType record,GoodsTypeExample example);

    int updateBatch(List<GoodsType> list);

    int updateBatchSelective(List<GoodsType> list);

    int batchInsert(List<GoodsType> list);

}
