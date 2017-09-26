package com.huangq.spring.annotate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by hq on 17/9/25.
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = annotationConfigApplicationContext.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("Java Config"));
        annotationConfigApplicationContext.close();
    }
}
