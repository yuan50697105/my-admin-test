package com.example.redis.dao;

import com.example.redis.pojo.BaseRedisEntity;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-03-28 15:28
 */
public interface BaseRedisDao<T, KEY> {

    void insert(BaseRedisEntity<KEY, T> entity);

    void update(BaseRedisEntity<KEY, T> entity);

    BaseRedisEntity<KEY, T> find(KEY key);
}