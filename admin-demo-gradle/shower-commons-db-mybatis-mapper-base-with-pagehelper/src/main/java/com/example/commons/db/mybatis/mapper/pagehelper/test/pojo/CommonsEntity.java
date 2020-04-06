package com.example.commons.db.mybatis.mapper.pagehelper.test.pojo;

import com.example.commons.db.mybatis.mapper.pagehelper.test.intercepter.CustomIntercepter;
import com.example.commons.db.pojo.BaseDbEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import java.util.Date;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 02:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CommonsEntity extends BaseDbEntity {
    /**
     * 主键
     */
    @Id
    @KeySql(genId = CustomIntercepter.class)
    private Long id;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
}