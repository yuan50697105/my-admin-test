package com.example.commons.db.mybatis.mapper.base.pagehelper.module.service.impl;

import com.example.commons.db.mybatis.mapper.base.pagehelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.mapper.base.pagehelper.module.mapper.GoodsTypeMapper;
import com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.GoodsType;
import com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.query.GoodsTypeQuery;
import com.example.commons.db.mybatis.mapper.base.pagehelper.module.service.GoodsTypeService;
import com.example.commons.db.pojo.IPageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import javax.annotation.Resource;
import java.util.List;
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

    @Override
    public IPageResult<GoodsType> selectPageByQuery(GoodsTypeQuery query) {
        PageHelper.startPage(query.getPage(), query.getSize());
        return new PageResult<>(new PageInfo<>(goodsTypeMapper.selectByExample(query.toExample())));
    }

    @Override
    public List<GoodsType> selectByQuery(GoodsTypeQuery query) {
        return goodsTypeMapper.selectByExample(query.toExample());
    }

    @Override
    public GoodsType selectByPrimaryKey(Long id) {
        return goodsTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(GoodsType goodsType) {
        return goodsTypeMapper.insert(goodsType);
    }

    @Override
    public int updateByPrimaryKeySelective(GoodsType goodsType) {
        return goodsTypeMapper.updateByPrimaryKeySelective(goodsType);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return goodsTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByPrimaryKeys(List<Long> ids) {
        Example.Builder builder = Example.builder(GoodsType.class);
        builder.where(Sqls.custom().andIn("id", ids));
        return goodsTypeMapper.deleteByExample(builder);
    }


}
