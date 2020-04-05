package com.example.commons.amqp.sender.impl;

import com.example.commons.amqp.sender.BaseSender;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BaseSenderImpl implements BaseSender {
    private RabbitTemplate rabbitTemplate;
    private RabbitMessagingTemplate rabbitMessagingTemplate;

    @Override
    public void send(String routingKey, Object object) {
        rabbitTemplate.convertAndSend(routingKey, object);
    }

    @Override
    public void send(String exchange, String routingKey, Object object) {
        rabbitTemplate.convertAndSend(exchange, routingKey, object);
    }

    @Override
    public Object sendAndRecive(String routingKey, Object object) {
        return rabbitTemplate.convertSendAndReceive(routingKey, object);
    }

    @Override
    public Object sendAndRecive(String exchange, String routingKey, Object object) {
        return rabbitTemplate.convertSendAndReceive(exchange, routingKey, object);
    }

}
