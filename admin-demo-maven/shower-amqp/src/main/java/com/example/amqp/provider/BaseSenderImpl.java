package com.example.amqp.provider;

import com.example.amqp.queue.QueueConfiguration;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.messaging.support.GenericMessage;
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

    public void send() {
        Object receive = rabbitTemplate.convertSendAndReceive("a", new GenericMessage<>("aaaa"));
        System.out.println("receive = " + receive);
    }

    public void sendTopic() {
        Object receive = rabbitTemplate.convertSendAndReceive(QueueConfiguration.TOPIC_EXCHANGE_01, QueueConfiguration.TOPIC_MESSAGE_01, QueueConfiguration.TOPIC_MESSAGE_01);
        System.out.println("receive = " + receive);
    }
}
