package com.example.commons.db.mybatis.jpa.base.sqlhelper.commons.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 02:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@MappedSuperclass
public class CommonsEntity extends com.example.commons.db.pojo.CommonsEntity {
    /**
     * 主键
     */
    @Id
    @GeneratedValue
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