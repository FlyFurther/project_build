package com.huangq.spring.annotate;

/**
 * Created by hq on 17/9/25.
 */
public class UseFunctionService {
    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
