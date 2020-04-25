package org.yuan.showercloud.modules.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @program: shower-cloud
 * @description:
 * @author: yuane
 * @create: 2020-04-25 21:25
 */
@Data
@Table(name = "sys_user")
@TableName("sys_user")
public class SysUser {
    @Id
    @KeySql
    @TableId(type = IdType.INPUT)
    private Long id;
    private String username;
    private String name;
    private String password;
}