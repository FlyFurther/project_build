package com.huangq.spring.more_thread;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

/**
 * Created by hq on 17/9/29.
 */
@Data
@Component
@PropertySource("classpath:test.properties")
public class ThreadPoolProperties {

    @Value("${corePoolSize}")
    private Integer corePoolSize;
    @Value("${maxPoolSize}")
    private Integer maxPoolSize;
    @Value("${queueCapacity}")
    private Integer queueCapacity;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfig() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
