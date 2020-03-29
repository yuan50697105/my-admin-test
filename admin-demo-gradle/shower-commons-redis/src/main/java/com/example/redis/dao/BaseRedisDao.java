package com.example.redis.dao;

import java.util.Optional;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-03-28 15:28
 */
public interface BaseRedisDao<T, KEY> {

    void insert(T t);

    void update(T t);

    Optional<T> find(KEY key);
}