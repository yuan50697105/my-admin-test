package com.example.commons.db.mybatis.base.sqlhelper.test.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.example.commons.db.mybatis.base.sqlhelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.base.sqlhelper.test.mapper.GoodsTypeMapper;
import com.example.commons.db.mybatis.base.sqlhelper.test.pojo.GoodsType;
import com.example.commons.db.mybatis.base.sqlhelper.test.pojo.GoodsTypeExample;
import com.example.commons.db.mybatis.base.sqlhelper.test.pojo.query.GoodsTypeQuery;
import com.example.commons.db.mybatis.base.sqlhelper.test.service.GoodsTypeService;
import com.example.db.pojo.IPageResult;
import com.example.commons.db.utils.DbUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {

    @Resource
    private GoodsTypeMapper goodsTypeMapper;

    @Override
    public long countByExample(GoodsTypeExample example) {
        return goodsTypeMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(GoodsTypeExample example) {
        return goodsTypeMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return goodsTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GoodsType record) {
        return goodsTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(GoodsType record) {
        return goodsTypeMapper.insertSelective(record);
    }

    @Override
    public List<GoodsType> selectByExample(GoodsTypeExample example) {
        return goodsTypeMapper.selectByExample(example);
    }

    @Override
    public GoodsType selectByPrimaryKey(Long id) {
        return goodsTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(GoodsType record, GoodsTypeExample example) {
        return goodsTypeMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(GoodsType record, GoodsTypeExample example) {
        return goodsTypeMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(GoodsType record) {
        return goodsTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GoodsType record) {
        return goodsTypeMapper.updateByPrimaryKey(record);
    }

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

    @Override
    public IPageResult<GoodsType> selectPageByQuery(GoodsTypeQuery query) {
        PageHelper.startPage(query.getPage(), query.getSize());
        GoodsTypeExample example = createExample(query);
        return new PageResult<>(new PageInfo<>(selectByExample(example)));
    }

    @Override
    public List<GoodsType> selectByQuery(GoodsTypeQuery query) {
        return selectByExample(createExample(query));
    }

    @Override
    public int deleteByIds(List<Long> ids) {
        GoodsTypeExample example = new GoodsTypeExample();
        example.or().andIdIn(ids);
        return deleteByExample(example);
    }

    public GoodsTypeExample createExample(GoodsTypeQuery query) {
        GoodsTypeExample example = new GoodsTypeExample();
        GoodsTypeExample.Criteria criteria = example.createCriteria();
        if (ObjectUtil.isNotEmpty(query.getName())) {
            criteria.andNameLike(DbUtils.likeContains(query.getName()));
        }
        return example;
    }

}
