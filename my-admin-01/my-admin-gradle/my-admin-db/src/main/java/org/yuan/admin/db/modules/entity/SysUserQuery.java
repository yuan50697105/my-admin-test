package org.yuan.admin.db.modules.entity;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.yuan.admin.db.commons.entity.CommonsQuery;

/**
 * @program: my-admin-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-19 19:01
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysUserQuery extends CommonsQuery implements MybatisExample<SysUserExample> {
    /**
     * username
     */
    @AndLike
    private String username;

    /**
     * name
     */
    @AndLike
    private String name;
    /**
     * enabled
     */
    @AndEqualTo
    private String enabled;
}