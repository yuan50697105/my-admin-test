package com.example.amqp.pojo;

import com.example.commons.pojo.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-03-28 15:45
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseAmqpEntity<T> extends BaseEntity {
    private String messageId;
    private T data;

    public BaseAmqpEntity() {
    }

    public BaseAmqpEntity(String messageId, T data) {
        this.messageId = messageId;
        this.data = data;
    }
}