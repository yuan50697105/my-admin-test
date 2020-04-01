package com.example.commons.db.solr.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.domain.Page;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-03-28 15:49
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PageResult<T> extends com.example.commons.db.es.pojo.PageResult<T> {
    public PageResult(long page, long size, long totalNumberOfRows, long totalPages, Iterable<T> data) {
        super(page, size, totalNumberOfRows, totalPages, data);
    }

    public PageResult(Page<T> page) {
        super(page.getPageable().getPageNumber() + 1, page.getPageable().getPageSize(), page.getTotalElements(), page.getTotalPages(), page.getContent());
    }
}