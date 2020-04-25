package org.yuan.adminbase.modules.entity;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.adminbase.commons.entity.BaseQuery;

/**
 * @program: admin-base
 * @description:
 * @author: yuane
 * @create: 2020-04-25 12:50
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysUserQuery extends BaseQuery implements MybatisExample<SysUserExample> {
    /**
     * 用户名
     */
    @AndLike
    private String username;
    /**
     * 姓名
     */
    @AndLike
    private String name;
    /**
     * 启用状态
     */
    @AndEqualTo
    private String enabled;
}