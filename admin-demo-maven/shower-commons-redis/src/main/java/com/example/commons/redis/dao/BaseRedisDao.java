package com.example.commons.redis.dao;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

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

    void setValue(String key, T t);

    void setValue(String key, T t, long time);

    void setValue(String key, T t, long time, TimeUnit unit);
}