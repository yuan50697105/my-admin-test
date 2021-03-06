package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.mapper;

import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.SysPermission;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysPermissionMapper extends tk.mybatis.mapper.common.Mapper<SysPermission> {
    int updateBatch(List<SysPermission> list);

    int updateBatchSelective(List<SysPermission> list);

    int batchInsert(@Param("list") List<SysPermission> list);
}