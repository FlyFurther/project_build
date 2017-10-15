package com.huangq.spring.combin_annotation;

import org.springframework.stereotype.Service;

/**
 * Created by hq on 17/9/29.
 */
@Service
public class DemoService {
    public void outputResult() {
        System.out.println("使用组合注解获取的Bean");
    }
}
