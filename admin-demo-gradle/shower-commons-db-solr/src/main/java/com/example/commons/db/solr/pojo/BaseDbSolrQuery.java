package com.example.commons.db.solr.pojo;

import com.example.commons.pojo.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: admin-demo
 * @description:
 * @author: yuane
 * @create: 2020-03-26 23:34
 */
@EqualsAndHashCode(callSuper = true)
@Data
public abstract class BaseDbSolrQuery extends BaseEntity {
    private Integer page = 1;
    private Integer size = 20;
}