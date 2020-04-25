package org.yuan.showercloud.mybatis.mapper;

import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @program: shower-cloud
 * @description:
 * @author: yuane
 * @create: 2020-04-25 21:13
 */
public interface CommonsMapper<T> extends Mapper<T>, IdsMapper<T>, com.baomidou.mybatisplus.core.mapper.Mapper<T> {
}