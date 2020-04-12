package com.example.commons.db.mybatis.base.pagehelper.module.mapper;

import com.example.commons.db.mybatis.base.pagehelper.module.pojo.GoodsOrderItem;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.GoodsOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoodsOrderItemMapper {
    long countByExample(GoodsOrderItemExample example);

    int deleteByExample(GoodsOrderItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsOrderItem record);

    int insertSelective(GoodsOrderItem record);

    List<GoodsOrderItem> selectByExample(GoodsOrderItemExample example);

    GoodsOrderItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsOrderItem record, @Param("example") GoodsOrderItemExample example);

    int updateByExample(@Param("record") GoodsOrderItem record, @Param("example") GoodsOrderItemExample example);

    int updateByPrimaryKeySelective(GoodsOrderItem record);

    int updateByPrimaryKey(GoodsOrderItem record);

    int updateBatch(List<GoodsOrderItem> list);

    int updateBatchSelective(List<GoodsOrderItem> list);

    int batchInsert(@Param("list") List<GoodsOrderItem> list);
}