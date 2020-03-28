package com.example.redis.dao.impl;

import cn.hutool.core.util.ClassUtil;
import com.example.redis.dao.BaseRedisDao;
import com.example.redis.pojo.BaseRedisEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisKeyValueTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-03-28 15:28
 */

public class BaseRedisDaoImpl<T, KEY> implements BaseRedisDao<T, KEY> {
    @Autowired
    private RedisKeyValueTemplate redisKeyValueTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    private Class<T> type;

    public BaseRedisDaoImpl() {
        //noinspection unchecked
        type = (Class<T>) ClassUtil.getTypeArgument(type, 0);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insert(BaseRedisEntity<KEY, T> entity) {
        redisKeyValueTemplate.insert(entity.getKey(), entity.getData());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(BaseRedisEntity<KEY, T> entity) {
        redisKeyValueTemplate.update(entity.getKey(), entity.getData());
    }

    @Override
    public BaseRedisEntity<KEY, T> find(KEY key) {
        return new BaseRedisEntity<KEY, T>(key, redisKeyValueTemplate.findById(key, type).orElse(null));
    }
}