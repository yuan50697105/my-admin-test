package com.example.commons.db.mybatis.plus.pagehelper.commons.intercepter;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.Executor;

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
public class CustomIntercepter implements Interceptor, IdentifierGenerator {

    public static final String ID = "id";
    public static final String CREATE_TIME = "createTime";
    public static final String UPDATE_TIME = "updateTime";

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        MappedStatement statement = ((MappedStatement) invocation.getArgs()[0]);
        Object object = invocation.getArgs()[1];
        List<Field> fields = getAllField(object);
        for (Field field : fields) {
            if (field.getName().equals(ID)) {
                if (statement.getSqlCommandType().equals(SqlCommandType.INSERT)) {
                    field.setAccessible(true);
                    if (ObjectUtil.isEmpty(field.get(object))) {
                        field.set(object, getId());
                    }
                }
            }
            if (field.getName().equals(CREATE_TIME)) {
                if (statement.getSqlCommandType().equals(SqlCommandType.INSERT)) {
                    field.setAccessible(true);
                    if (ObjectUtil.isEmpty(field.get(object))) {
                        field.set(object,new Date());
                    }
                }
            }
            if (field.getName().equals(UPDATE_TIME)) {
                if (statement.getSqlCommandType().equals(SqlCommandType.UPDATE)) {
                    field.setAccessible(true);
                    if (ObjectUtil.isEmpty(field.get(object))) {
                        field.set(object,new Date());
                    }
                }
            }
        }
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return target;
    }

    @Override
    public void setProperties(Properties properties) {

    }

    public List<Field> getAllField(Object object) {
        Class<?> objectClass = object.getClass();
        ArrayList<Field> fields = new ArrayList<>(Arrays.asList(objectClass.getDeclaredFields()));
        while ((objectClass = objectClass.getSuperclass()) != null) {
            fields.addAll(Arrays.asList(objectClass.getDeclaredFields()));
        }
        return fields;
    }

    public long getId() {
        return IdUtil.getSnowflake(1, 1).nextId();
    }

    @Override
    public Number nextId(Object entity) {
        return getId();
    }
}