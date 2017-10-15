package com.huangq.spring.scheduled_task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hq on 17/10/13.
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 5000)  //使用Scheduled注解只是一个计划任务
    public void reportCurrentTime() {
        System.out.println("每隔5秒报时一次:" + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 28 11 ? * *")
    public void fixTimeExecution() {
        System.out.println("指定时间执行:" + dateFormat.format(new Date()));
    }
}
