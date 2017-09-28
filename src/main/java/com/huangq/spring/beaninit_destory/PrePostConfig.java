package com.huangq.spring.beaninit_destory;

import org.springframework.context.annotation.Bean;

/**
 * Created by hq on 17/9/27.
 */
public class PrePostConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }
}
