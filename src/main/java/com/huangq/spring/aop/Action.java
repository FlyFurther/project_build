package com.huangq.spring.aop;

import java.lang.annotation.*;

/**
 * Created by hq on 17/9/25.
 * 拦截规则的注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
