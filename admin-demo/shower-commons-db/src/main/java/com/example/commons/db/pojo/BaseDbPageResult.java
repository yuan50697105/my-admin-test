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
public class BaseDbPageResult<T> extends BaseEntity {
    private Long page;
    private Long size;
    private Long totalNumberOfRows;
    private Long totalPages;
    private Iterable<T> data;

    public BaseDbPageResult(Long page, Long size, Long totalNumberOfRows, Long totalPages, Iterable<T> data) {
        this.page = page;
        this.size = size;
        this.totalNumberOfRows = totalNumberOfRows;
        this.totalPages = totalPages;
        this.data = data;
    }
}