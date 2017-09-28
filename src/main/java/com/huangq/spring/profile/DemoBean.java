package com.huangq.spring.profile;

import lombok.Data;

/**
 * Created by hq on 17/9/28.
 */
@Data
public class DemoBean {
    private String content;

    public DemoBean() {

    }

    public DemoBean(String content) {
        this.content = content;
    }
}
