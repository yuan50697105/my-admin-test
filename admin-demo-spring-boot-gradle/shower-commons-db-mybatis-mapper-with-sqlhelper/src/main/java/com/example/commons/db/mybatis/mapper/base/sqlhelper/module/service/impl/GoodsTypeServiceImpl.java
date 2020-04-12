package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.mapper.GoodsTypeMapper;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.GoodsType;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service.GoodsTypeService;
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService{

    @Resource
    private GoodsTypeMapper goodsTypeMapper;

    @Override
    public int updateBatch(List<GoodsType> list) {
        return goodsTypeMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<GoodsType> list) {
        return goodsTypeMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<GoodsType> list) {
        return goodsTypeMapper.batchInsert(list);
    }

}
