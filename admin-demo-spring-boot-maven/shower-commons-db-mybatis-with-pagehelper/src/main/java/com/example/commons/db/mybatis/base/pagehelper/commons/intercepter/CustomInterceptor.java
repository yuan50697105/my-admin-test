package com.example.commons.db.mybatis.base.pagehelper.commons.intercepter;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.ObjectUtil;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 02:13
 */
@Component
@Intercepts({
        @Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class})

})
public class CustomInterceptor implements Interceptor {

    public static final String ID = "id";
    public static final String CREATE_TIME = "createTime";
    public static final String UPDATE_TIME = "updateTime";

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        MappedStatement statement = ((MappedStatement) invocation.getArgs()[0]);
        SqlCommandType sqlCommandType = statement.getSqlCommandType();
        Object object = invocation.getArgs()[1];
        List<Field> fields = getAllField(object);
        for (Field field : fields) {
            if (field.getName().equals(ID)) {
                if (sqlCommandType.equals(SqlCommandType.INSERT)) {
                    field.setAccessible(true);
                    if (ObjectUtil.isEmpty(field.get(object))) {
                        field.set(object, IdUtil.getSnowflake(1, 1).nextId());
                    }
                }
            }
            if (field.getName().equals(CREATE_TIME)) {
                if (sqlCommandType.equals(SqlCommandType.INSERT) || sqlCommandType.equals(SqlCommandType.UPDATE)) {
                    field.setAccessible(true);
                    if (ObjectUtil.isEmpty(field.get(object))) {
                        field.set(object, new Date());
                    }
                }
            }
            if (field.getName().equals(UPDATE_TIME)) {
                if (sqlCommandType.equals(SqlCommandType.UPDATE)) {
                    field.setAccessible(true);
                    if (ObjectUtil.isEmpty(field.get(object))) {
                        field.set(object, new Date());
                    }
                }
            }
        }
        return invocation.proceed();
    }


    public List<Field> getAllField(Object object) {
        Class<?> objectClass = object.getClass();
        ArrayList<Field> fields = new ArrayList<>(Arrays.asList(objectClass.getDeclaredFields()));
        while ((objectClass = objectClass.getSuperclass()) != null) {
            fields.addAll(Arrays.asList(objectClass.getDeclaredFields()));
        }
        return fields;
    }

}