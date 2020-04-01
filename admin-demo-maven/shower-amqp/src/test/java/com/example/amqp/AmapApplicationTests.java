package com.example.amqp;

import com.example.amqp.provider.Provider;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = AmapApplication.class)
public class AmapApplicationTests {
    @Autowired
    private ApplicationContext context;

    @Test
    void t1() {
        Provider provider = context.getBean(Provider.class);
        provider.send();

    }

    @Test
    void t2() {
        Provider provider = context.getBean(Provider.class);
        provider.sendTopic();
    }
}
