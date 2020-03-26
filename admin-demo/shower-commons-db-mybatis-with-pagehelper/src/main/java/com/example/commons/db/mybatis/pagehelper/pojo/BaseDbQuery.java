package com.example.commons.db.mybatis.pagehelper.pojo;

import com.github.pagehelper.IPage;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: admin-demo
 * @description:
 * @author: yuane
 * @create: 2020-03-26 23:39
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseDbQuery extends com.example.commons.db.pojo.BaseDbQuery implements IPage {
    @Override
    public Integer getPageNum() {
        return getPage();
    }

    @Override
    public Integer getPageSize() {
        return getSize();
    }

    @Override
    public String getOrderBy() {
        return null;
    }
}