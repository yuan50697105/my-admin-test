package com.example.commons.db.mybatis.mapper.base.pagehelper.module.mapper;

import com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.SysRolePermission;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysRolePermissionMapper extends tk.mybatis.mapper.common.Mapper<SysRolePermission> {
    int updateBatch(List<SysRolePermission> list);

    int updateBatchSelective(List<SysRolePermission> list);

    int batchInsert(@Param("list") List<SysRolePermission> list);
}