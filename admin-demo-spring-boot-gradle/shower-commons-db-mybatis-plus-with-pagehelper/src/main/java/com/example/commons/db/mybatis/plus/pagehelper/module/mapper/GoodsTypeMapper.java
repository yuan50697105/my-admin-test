package com.example.commons.db.mybatis.plus.pagehelper.module.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.GoodsType;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.GoodsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoodsTypeMapper extends BaseMapper<GoodsType> {
    long countByExample(GoodsTypeExample example);

    int deleteByExample(GoodsTypeExample example);

    List<GoodsType> selectByExample(GoodsTypeExample example);

    int updateByExampleSelective(@Param("record") GoodsType record, @Param("example") GoodsTypeExample example);

    int updateByExample(@Param("record") GoodsType record, @Param("example") GoodsTypeExample example);

    int updateBatch(List<GoodsType> list);

    int updateBatchSelective(List<GoodsType> list);

    int batchInsert(@Param("list") List<GoodsType> list);
}