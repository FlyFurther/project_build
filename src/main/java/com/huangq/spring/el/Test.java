package com.huangq.spring.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by hq on 17/9/27.
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig elConfig = context.getBean(ElConfig.class);
        elConfig.outputResource();
        context.close();
    }
}
