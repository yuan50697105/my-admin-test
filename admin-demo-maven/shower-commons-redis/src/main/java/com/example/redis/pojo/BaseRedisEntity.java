package com.example.redis.pojo;

import com.example.commons.pojo.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-03-28 15:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseRedisEntity<KEY, T> extends BaseEntity {
    private KEY key;
    private T data;

    public BaseRedisEntity() {
    }

    public BaseRedisEntity(KEY key, T data) {
        this.key = key;
        this.data = data;
    }

    @SuppressWarnings("unchecked")
    public Class<T> getDataClass() {
        return (Class<T>) data.getClass();
    }
}