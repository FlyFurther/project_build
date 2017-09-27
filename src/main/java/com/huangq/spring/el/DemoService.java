package com.huangq.spring.el;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by hq on 17/9/27.
 */
@Data
@Service
public class DemoService {
    @Value("类的属性")
    private String another;
}
