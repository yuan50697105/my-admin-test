package com.example.commons.db.es;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = JestEsApplication.class)
public class JestEsApplicationTests {
    @Autowired
    private ApplicationContext context;
}
