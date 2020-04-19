package com.example.commons.db.mybatis.base.pageable.base.pojo;

import com.example.commons.db.pojo.IPageResult;
import com.gitee.hengboy.mybatis.pageable.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: admin-demo
 * @description:
 * @author: yuane
 * @create: 2020-03-27 00:45
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PageResult<T> extends IPageResult<T> {
    public PageResult(Long page, Long size, Long totalNumberOfRows, Long totalPages, Iterable<T> data) {
        super(page, size, totalNumberOfRows, totalPages, data);
    }

    public PageResult(Page<T> page) {
        super(page.getPageIndex(), page.getPageSize(), page.getTotalElements(), page.getTotalPages(), page.getData());
    }

}