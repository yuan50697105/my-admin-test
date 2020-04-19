package org.yuan.admin.db.modules.service;

import org.yuan.admin.commons.entity.IPageResult;
import org.yuan.admin.db.modules.entity.SysUser;
import java.util.List;
import org.yuan.admin.db.modules.entity.SysUserExample;
import org.yuan.admin.db.modules.entity.SysUserQuery;

public interface SysUserService{


    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(SysUser record,SysUserExample example);

    int updateByExample(SysUser record,SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    IPageResult<SysUser> selectPageByExample(int page, int pageSize, SysUserExample example);

    IPageResult<SysUser> selectPageByQuery(SysUserQuery query);

    List<SysUser> selectByQuery(SysUserQuery query);
}
