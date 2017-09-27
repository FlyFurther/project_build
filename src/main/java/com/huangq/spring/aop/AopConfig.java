package com.huangq.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by hq on 17/9/26.
 */
@Configuration
@ComponentScan("com.huangq.spring.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
