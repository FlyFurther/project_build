package com.huangq.spring.conditional;

/**
 * Created by hq on 17/9/29.
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
