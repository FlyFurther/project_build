package com.huangq.spring.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by hq on 17/9/28.
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher publisher = context.getBean(DemoPublisher.class);
        publisher.publish("Hello DemoListener");
        context.close();
    }
}
