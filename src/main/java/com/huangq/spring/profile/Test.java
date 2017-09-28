package com.huangq.spring.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by hq on 17/9/28.
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.getEnvironment().setActiveProfiles("dev");
//        context.register(ProfileConfig.class);
//        context.refresh();
//        DemoBean dev = context.getBean(DemoBean.class);
//        System.out.println(dev.getContent());

        context.getEnvironment().setActiveProfiles("prod"); //设置Profile
        context.register(ProfileConfig.class);  //注册Bean配置类,先设置后注册
        context.refresh(); //刷新容器
        DemoBean prod = context.getBean(DemoBean.class);
        System.out.println(prod.getContent());

        context.close();
    }
}
