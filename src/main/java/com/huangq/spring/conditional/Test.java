package com.huangq.spring.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by hq on 17/9/29.
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        String osName = context.getEnvironment().getProperty("os.name");
        System.out.println(osName + "操作系统下的文件列表命令为:" + listService.showListCmd());
    }
}
