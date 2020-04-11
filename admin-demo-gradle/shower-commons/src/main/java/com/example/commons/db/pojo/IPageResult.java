package com.example.commons.db.pojo;

import com.example.commons.pojo.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: admin-demo
 * @description:
 * @author: yuane
 * @create: 2020-03-26 23:35
 */
@EqualsAndHashCode(callSuper = true)
@Data
public abstract class IPageResult<T> extends BaseEntity {
    private long page;
    private long size;
    private long totalNumberOfRows;
    private long totalPages;
    private Iterable<T> list;

    public IPageResult(long page, long size, long totalNumberOfRows, long totalPages, Iterable<T> list) {
        this.page = page;
        this.size = size;
        this.totalNumberOfRows = totalNumberOfRows;
        this.totalPages = totalPages;
        this.list = list;
    }


}