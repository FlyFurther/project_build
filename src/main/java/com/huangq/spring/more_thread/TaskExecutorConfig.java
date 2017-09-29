package com.huangq.spring.more_thread;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * Created by hq on 17/9/29.
 */
@Configuration
@ComponentScan
@EnableAsync  //注解开启异步任务支持
@PropertySource("classpath:test.properties")
public class TaskExecutorConfig implements AsyncConfigurer { //实现接口,返回ThreadPoolTaskExecutor

    @Autowired
    private ThreadPoolProperties threadPoolProperties;

    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor threadPool = new ThreadPoolTaskExecutor();
        threadPool.setCorePoolSize(threadPoolProperties.getCorePoolSize());
        threadPool.setMaxPoolSize(threadPoolProperties.getMaxPoolSize());
        threadPool.setQueueCapacity(threadPoolProperties.getQueueCapacity());
        threadPool.initialize();
        return threadPool;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
