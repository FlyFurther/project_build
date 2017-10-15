package com.huangq.spring.combin_annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by hq on 17/9/29.
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WiselyConfiguration.class);
        DemoService demoService  = context.getBean(DemoService.class);
        demoService.outputResult();
        context.close();
    }
}
