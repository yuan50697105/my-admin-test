package org.yuan.admin.db.commons.entity;

import com.github.pagehelper.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.admin.commons.entity.IPageResult;

/**
 * @program: my-admin-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-19 19:10
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PageResult<T> extends IPageResult<T> {
    public PageResult(PageInfo<T> pageInfo) {
        super(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal(), pageInfo.getPages(), pageInfo.getList());
    }

    public PageResult(long page, long size, long totalRecord, long totalRows, Iterable<T> iterable) {
        super(page, size, totalRecord, totalRows, iterable);
    }
}