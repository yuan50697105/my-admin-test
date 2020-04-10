package com.example.commons.db.es;

import com.example.commons.db.es.test.SysUser;
import com.example.commons.db.es.test.SysUserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = JestEsApplication.class)
public class JestEsApplicationTests {
    @Autowired
    private ApplicationContext context;
}