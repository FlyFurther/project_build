package com.huangq.spring.combin_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * Created by hq on 17/9/29.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration  //组合元注解
@ComponentScan  //组合元注解
public @interface WiselyConfiguration {
    String[] value() default {};  //覆盖value参数
}
