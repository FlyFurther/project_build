package com.huangq.spring.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by hq on 17/9/27.
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService s = context.getBean(DemoSingletonService.class);
        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoPrototypeService p = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        System.out.println("s和s1是否相等:" + s1.equals(s));
        System.out.println("p和p1是否相等:" + p.equals(p1));
        context.close();
    }
}
