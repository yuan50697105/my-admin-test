package com.example.commons.db.mybatis.base.pagehelper;

import cn.hutool.extra.spring.SpringUtil;
import cn.hutool.json.JSONUtil;
import com.example.commons.db.mybatis.base.pagehelper.module.constants.EnableConstants;
import com.example.commons.db.mybatis.base.pagehelper.module.constants.PermissionConstants;
import com.example.commons.db.mybatis.base.pagehelper.module.utils.DictDbUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import java.util.List;
import java.util.Map;

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
    @Bean
    public CommandLineRunner insertDict() {
        log.info("insert dict");
        return args -> {
            DictDbUtils.setDict(EnableConstants.class);
            DictDbUtils.setDict(PermissionConstants.PermissionType.class);
            Map<String, List<Map<String, String>>> map = DictDbUtils.getAllDict();
            String prettyStr = JSONUtil.toJsonPrettyStr(map);
            log.info("prettyStr = "+prettyStr);
        };
    }
}