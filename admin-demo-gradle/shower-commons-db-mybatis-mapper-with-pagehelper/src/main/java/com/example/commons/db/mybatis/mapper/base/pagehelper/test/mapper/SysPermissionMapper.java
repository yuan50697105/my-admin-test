package com.example.commons.db.mybatis.mapper.base.pagehelper.test.mapper;

import com.example.commons.db.mybatis.mapper.base.pagehelper.test.pojo.SysPermission;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysPermissionMapper extends tk.mybatis.mapper.common.Mapper<SysPermission> {
    int updateBatch(List<SysPermission> list);

    int updateBatchSelective(List<SysPermission> list);

    int batchInsert(@Param("list") List<SysPermission> list);
}