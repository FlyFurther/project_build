package com.huangq.spring.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hq on 17/9/28.
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware{
    private String beanName;   //bean名称
    private ResourceLoader resourceLoader;  //外部资源加载器

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void outputResult() {
        System.out.println("bean名称是:" + beanName);
        Resource resource = resourceLoader.getResource("classpath:test.txt");
        try {
            System.out.println("加载的文件内容是:" + IOUtils.toString(new InputStreamReader(resource.getInputStream())));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
