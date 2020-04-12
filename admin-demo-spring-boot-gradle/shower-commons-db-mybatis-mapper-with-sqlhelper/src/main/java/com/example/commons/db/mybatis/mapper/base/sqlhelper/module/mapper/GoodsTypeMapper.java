package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.mapper;

import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.GoodsType;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoodsTypeMapper extends tk.mybatis.mapper.common.Mapper<GoodsType> {
    int updateBatch(List<GoodsType> list);

    int updateBatchSelective(List<GoodsType> list);

    int batchInsert(@Param("list") List<GoodsType> list);
}