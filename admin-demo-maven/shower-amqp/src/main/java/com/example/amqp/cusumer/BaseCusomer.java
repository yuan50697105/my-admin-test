package com.example.amqp.cusumer;

import com.example.amqp.queue.QueueConfiguration;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = {QueueConfiguration.QUEUE_01, QueueConfiguration.QUEUE_02, QueueConfiguration.DIRECT_QUEUE_01, QueueConfiguration.TOPIC_QUEUE_01, QueueConfiguration.TOPIC_QUEUE_02})
public class BaseCusomer {

    @RabbitHandler
    public String aa(String message) {
        System.out.println("message = " + message);
        return message;
    }
}
