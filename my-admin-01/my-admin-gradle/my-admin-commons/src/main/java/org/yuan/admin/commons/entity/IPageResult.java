package org.yuan.admin.commons.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: my-admin-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-19 19:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IPageResult<T> {
    private long page;
    private long size;
    private long totalRecord;
    private long totalRows;
    private Iterable<T> iterable;

}