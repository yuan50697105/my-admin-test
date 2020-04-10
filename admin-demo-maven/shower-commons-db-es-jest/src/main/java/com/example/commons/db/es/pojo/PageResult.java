package com.example.commons.db.es.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.domain.Page;

/**
 * @program: admin-demo
 * @description:
 * @author: yuane
 * @create: 2020-03-26 23:35
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PageResult<T> extends com.example.commons.db.pojo.PageResult<T> {
    public PageResult(long page, long size, long totalNumberOfRows, long totalPages, Iterable<T> data) {
        super(page, size, totalNumberOfRows, totalPages, data);
    }

    public PageResult(Page<T> page) {
        super(page.getPageable().getPageNumber() + 1, page.getPageable().getPageSize(), page.getTotalElements(), page.getTotalPages(), page.getContent());
    }
}