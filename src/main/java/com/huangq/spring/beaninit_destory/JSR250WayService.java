package com.huangq.spring.beaninit_destory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by hq on 17/9/27.
 */
public class JSR250WayService {
    @PostConstruct
    public void init() {
        System.out.println("jsr-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("构造函数-JSR250WayService");
    }

    @PreDestroy
    public void destory() {
        System.out.println("jsr-destroy-method");
    }
}
