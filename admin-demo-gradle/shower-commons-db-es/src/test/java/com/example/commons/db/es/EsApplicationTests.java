package com.example.commons.db.es;

import com.example.commons.db.es.test.SysUser;
import com.example.commons.db.es.test.SysUserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = EsApplication.class)
public class EsApplicationTests {
    @Autowired
    private ApplicationContext context;

    @Autowired
    private SysUserRepo sysUserRepo;

    @Test
    void name() {
        SysUser sysUser = SysUser.builder().content("asdasd").build();
        SysUser save = sysUserRepo.save(sysUser);
        System.out.println("save = " + save);

    }

    @Test
    void t2() {
        Iterable<SysUser> sysUsers = sysUserRepo.findAll();
        System.out.println("sysUsers = " + sysUsers);
    }
}
