package com.example.amqp.provider;

public interface BaseSender {
    void send(String routingKey, Object object);

    void send(String exchange, String routingKey, Object object);

    Object sendAndRecive(String routingKey, Object object);

    Object sendAndRecive(String exchange, String routingKey, Object object);
}
