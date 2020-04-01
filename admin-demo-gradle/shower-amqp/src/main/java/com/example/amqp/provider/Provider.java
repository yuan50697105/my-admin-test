package com.example.amqp.provider;

import com.example.amqp.queue.QueueConfiguration;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Provider {
    private RabbitTemplate rabbitTemplate;
    private RabbitMessagingTemplate rabbitMessagingTemplate;

    public void send() {
        Object receive = rabbitTemplate.convertSendAndReceive("a", new GenericMessage<>("aaaa"));
        System.out.println("receive = " + receive);
    }

    public void sendTopic() {
        Object receive = rabbitTemplate.convertSendAndReceive(QueueConfiguration.TOPIC_EXCHANGE_01, QueueConfiguration.TOPIC_MESSAGE_01, QueueConfiguration.TOPIC_MESSAGE_01);
        System.out.println("receive = " + receive);
    }
}
