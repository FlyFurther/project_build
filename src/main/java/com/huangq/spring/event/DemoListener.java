package com.huangq.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by hq on 17/9/28.
 * 事件监听器
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("bean-listener接收到了bean-demoPublisher发布的消息:" + msg);
    }
}
