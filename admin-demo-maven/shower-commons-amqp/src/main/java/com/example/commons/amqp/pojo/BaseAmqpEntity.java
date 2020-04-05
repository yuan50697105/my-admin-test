package com.example.commons.amqp.pojo;

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
public class BaseAmqpEntity<MSGID, T> extends BaseEntity {
    private MSGID messageId;
    private T data;

    public BaseAmqpEntity() {
    }

    public BaseAmqpEntity(MSGID messageId, T data) {
        this.messageId = messageId;
        this.data = data;
    }
}