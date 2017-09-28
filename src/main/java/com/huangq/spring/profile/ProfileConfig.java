package com.huangq.spring.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * Created by hq on 17/9/28.
 */
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public DemoBean devDemoBean() {
        return new DemoBean("dev Bean");
    }

    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean() {
        return new DemoBean("prod Bean");
    }
}
