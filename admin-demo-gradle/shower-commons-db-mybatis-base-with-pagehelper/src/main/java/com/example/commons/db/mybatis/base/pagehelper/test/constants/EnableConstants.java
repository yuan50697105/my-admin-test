package com.example.commons.db.mybatis.base.pagehelper.test.constants;

import com.example.commons.db.utils.DictUtils;
import com.example.commons.db.utils.annotation.ConstantsName;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @program: admin-demo-gradle
 * @description: 启用状态
 * @author: yuane
 * @create: 2020-04-06 02:47
 */
@Component(EnableConstants.ENABLE_CONSTANTS_RUNNER)
public class EnableConstants implements CommandLineRunner {
    public static final String ENABLE_CONSTANTS_RUNNER = "enableConstantsRunner";
    @ConstantsName(name = "启用")
    public static final String ENABLED = "ENABLED";
    @ConstantsName(name = "停用")
    public static final String DISABLED = "DISABLED";

    private EnableConstants() {

    }

    @Override
    public void run(String... args) throws Exception {
        Map<String, String> dictKeyValue = DictUtils.getDictKeyValue(this.getClass());
        String dictCode = DictUtils.getDictCode(this.getClass());

    }

}