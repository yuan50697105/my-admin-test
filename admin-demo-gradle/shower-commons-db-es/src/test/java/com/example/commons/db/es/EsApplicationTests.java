package com.example.commons.db.es;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = EsApplication.class)
public class EsApplicationTests {
    @Autowired
    private ApplicationContext context;

}
