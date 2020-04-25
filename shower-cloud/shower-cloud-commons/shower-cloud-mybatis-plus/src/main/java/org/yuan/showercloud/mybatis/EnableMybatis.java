package org.yuan.showercloud.mybatis;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Inherited
@Documented
@ComponentScan(basePackages = "tk.*")
public @interface EnableMybatis {
}
