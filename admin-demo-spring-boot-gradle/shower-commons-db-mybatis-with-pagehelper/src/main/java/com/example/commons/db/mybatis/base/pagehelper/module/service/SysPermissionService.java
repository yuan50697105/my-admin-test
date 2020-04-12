package com.example.commons.db.mybatis.base.pagehelper.module.service;

import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysPermission;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysPermissionExample;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.query.SysPermissionQuery;
import com.example.db.pojo.IPageResult;

import java.util.List;
public interface SysPermissionService{


    long countByExample(SysPermissionExample example);

    int deleteByExample(SysPermissionExample example);

    int deleteByPrimaryKey(Long id);

<<<<<<< .merge_file_a17552
    int deleteByPrimaryKeys(List<Long> ids);

=======
>>>>>>> .merge_file_a16492
    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    List<SysPermission> selectByExample(SysPermissionExample example);

    SysPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(SysPermission record,SysPermissionExample example);

    int updateByExample(SysPermission record,SysPermissionExample example);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);

    int updateBatch(List<SysPermission> list);

    int updateBatchSelective(List<SysPermission> list);

    int batchInsert(List<SysPermission> list);

    List<SysPermission> selectByIds(List<Long> ids);

<<<<<<< .merge_file_a17552
=======
    int deleteByIds(List<Long> ids);

>>>>>>> .merge_file_a16492
    IPageResult<SysPermission> selectPageByQuery(SysPermissionQuery query);

    List<SysPermission> selectByQuery(SysPermissionQuery query);

    IPageResult<SysPermission> selectPageByExample(SysPermissionExample example, Integer page, Integer size);
}
