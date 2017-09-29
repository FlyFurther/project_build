package com.huangq.spring.more_thread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by hq on 17/9/29.
 */
@Service
public class AsyncTaskService {
    @Async
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务:" + i + "; 线程名称:" + Thread.currentThread().getName());
    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("执行异步任务i+1:" + (i+1) + "; 线程名称:" + Thread.currentThread().getName());
    }
}
