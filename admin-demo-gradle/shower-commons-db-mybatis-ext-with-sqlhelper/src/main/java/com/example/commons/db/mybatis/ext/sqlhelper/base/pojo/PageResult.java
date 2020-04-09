package com.example.commons.db.mybatis.ext.sqlhelper.base.pojo;

import com.example.commons.db.pojo.IPageResult;
import com.github.pagehelper.PageInfo;
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

    public PageResult(PageInfo<T> pageInfo) {
        super(pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages(), pageInfo.getList());
    }
}