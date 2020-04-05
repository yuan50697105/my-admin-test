package com.example.commons.redis.dao.impl;

import cn.hutool.core.util.ClassUtil;
import cn.hutool.json.JSONUtil;
import com.example.commons.redis.dao.BaseRedisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisKeyValueTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

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

    @SuppressWarnings("unchecked")
    public BaseRedisDaoImpl() {
        type = (Class<T>) ClassUtil.getTypeArgument(type, 0);
    }

    @Override
    public void insert(T t) {
        redisKeyValueTemplate.insert(t);
    }

    @Override
    public void update(T t) {
        redisKeyValueTemplate.update(t);
    }

    @Override
    public Optional<T> find(KEY key) {
        return redisKeyValueTemplate.findById(key, type);
    }


    @Override
    public void setValue(String key, T t) {
        stringRedisTemplate.opsForValue().set(key, JSONUtil.toJsonStr(t));
    }

    @Override
    public void setValue(String key, T t, long time) {
        stringRedisTemplate.opsForValue().set(key, JSONUtil.toJsonStr(t), time);
    }

    @Override
    public void setValue(String key, T t, long time, TimeUnit unit) {
        stringRedisTemplate.opsForValue().set(key, JSONUtil.toJsonStr(t),time,unit);
    }
}