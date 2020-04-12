package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.mapper.GoodsInfoMapper;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.GoodsInfo;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service.GoodsInfoService;
@Service
public class GoodsInfoServiceImpl implements GoodsInfoService{

    @Resource
    private GoodsInfoMapper goodsInfoMapper;

    @Override
    public int updateBatch(List<GoodsInfo> list) {
        return goodsInfoMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<GoodsInfo> list) {
        return goodsInfoMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<GoodsInfo> list) {
        return goodsInfoMapper.batchInsert(list);
    }

}
