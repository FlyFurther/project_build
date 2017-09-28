package com.huangq.spring.event;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * Created by hq on 17/9/28.
 * 自定义事件
 */
@Data
public class DemoEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1l;
    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }
}
