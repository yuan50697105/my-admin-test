package com.example.commons.amqp.queue;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfiguration {

    public static final String QUEUE_01 = "QUEUE_01";
    public static final String QUEUE_02 = "QUEUE_02";
    public static final String DIRECT_QUEUE_01 = "DIRECT_QUEUE_01";
    public static final String DIRECT_QUEUE_02 = "DIRECT_QUEUE_02";
    public static final String TOPIC_QUEUE_01 = "TOPIC_QUEUE_01";
    public static final String TOPIC_QUEUE_02 = "TOPIC_QUEUE_02";

    public static final String DIRECT_EXCHANGE_01 = "DIRECT_EXCHANGE_01";
    public static final String TOPIC_EXCHANGE_01 = "TOPIC_EXCHANGE_01";

    public static final String DIRECT_BINDING_01 = "DIRECT_BINDING_01";
    public static final String TOPIC_BINDING_01 = "TOPIC_BINDING_01";
    public static final String TOPIC_BINDIND_02 = "TOPIC_BINDIND_02";

    public static final String TOPIC_01 = "TOPIC.MESSAGE01";
    public static final String TOPIC_02 = "TOPIC.MESSAGE02";

    public static final String DIRECT_ROUTE_KEY = "DIRECT_ROUTE_KEY";

    @Bean(QUEUE_01)
    public Queue queue_01() {
        return new Queue(QUEUE_01);
    }

    @Bean(QUEUE_02)
    public Queue queue_02() {
        return new Queue(QUEUE_02);
    }

    @Bean(DIRECT_QUEUE_01)
    public Queue direct_queue_01() {
        return new Queue(DIRECT_QUEUE_01);
    }

    @Bean(DIRECT_QUEUE_02)
    public Queue direct_queue_02() {
        return new Queue(DIRECT_QUEUE_02);
    }

    @Bean(TOPIC_QUEUE_01)
    public Queue topic_queue_01() {
        return new Queue(TOPIC_QUEUE_01);
    }

    @Bean(TOPIC_QUEUE_02)
    public Queue topic_queue_02() {
        return new Queue(TOPIC_QUEUE_02);
    }

    @Bean(DIRECT_EXCHANGE_01)
    public DirectExchange directExchange01() {
        return new DirectExchange(DIRECT_EXCHANGE_01);
    }

    @Bean(DIRECT_BINDING_01)
    public Binding direct_binding_01(@Qualifier(DIRECT_QUEUE_01) Queue queue, DirectExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(DIRECT_ROUTE_KEY);
    }

    @Bean(TOPIC_EXCHANGE_01)
    public TopicExchange exchange_01() {
        return new TopicExchange(TOPIC_EXCHANGE_01);
    }

    @Bean(TOPIC_BINDING_01)
    public Binding topic_binding_01(@Qualifier(TOPIC_QUEUE_01) Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(TOPIC_01);
    }

    @Bean(TOPIC_BINDIND_02)
    public Binding topic_binding_02(@Qualifier(TOPIC_QUEUE_02) Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(TOPIC_02);
    }

}
