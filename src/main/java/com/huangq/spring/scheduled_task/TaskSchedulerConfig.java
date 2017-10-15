package com.huangq.spring.scheduled_task;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by hq on 17/10/13.
 */
@Configuration
@EnableScheduling  //开启对计划任务的支持
@ComponentScan("com.huangq.spring.scheduled_task")
public class TaskSchedulerConfig {
}
