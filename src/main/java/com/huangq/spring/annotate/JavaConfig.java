package com.huangq.spring.annotate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hq on 17/9/25.
 */

@Configuration  //使用@Configuration注解表明当前类是一个配置类,意味着这个类中可能有0个或者多个@Bean注解
public class JavaConfig {
    @Bean //注解声明当前方法返回值是一个Bean,Bean的名称是方法名
    public FunctionService functionService() {
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService() {
        UseFunctionService useFunctionService  = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());//注入functionService的Bean时调用方法
        return useFunctionService;
    }

    @Bean  //可以直接将functionService对象作为参数给userFunctionService, 在Spring容器中,
            // 只要容器中存在莫个Bean,就可以在另外一个Bean的声明方法中通过参数注入依赖对象
    public UseFunctionService useFunctionService(FunctionService functionService) {
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService);
        return useFunctionService;
    }
}
