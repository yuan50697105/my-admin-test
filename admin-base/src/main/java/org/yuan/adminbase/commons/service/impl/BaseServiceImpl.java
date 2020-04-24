package org.yuan.adminbase.commons.service.impl;

import org.springframework.stereotype.Service;
import org.yuan.adminbase.commons.mapper.BaseMapper;
import org.yuan.adminbase.commons.service.BaseService;

/**
 * @program: admin-base
 * @description: 通用基础服务实现类
 * @author: yuane
 * @create: 2020-04-24 22:43
 */
@Service
public class BaseServiceImpl<T, M extends BaseMapper<T>> implements BaseService<T, M> {
}