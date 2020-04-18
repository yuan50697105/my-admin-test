package com.example.commons.db.mybatis.base.pagehelper;

import cn.hutool.extra.spring.SpringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Import;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 16:13
 */
@SpringBootConfiguration
@Import(SpringUtil.class)
@Slf4j
public class MybatisPageHelperAutoConfiguration {
}