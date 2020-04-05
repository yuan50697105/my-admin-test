package com.example.commons.db.es;

import com.example.commons.db.es.test.SysUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EsApplication {
    @Autowired
    private SysUserRepo sysUserRepo;

    public static void main(String[] args) {
        SpringApplication.run(EsApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return args -> {
            sysUserRepo.findAll().forEach(sysUser -> System.out.println("sysUser = " + sysUser));
        };
    }
}
