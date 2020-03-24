package com.yeqifu.utils;

/**
 * 用于记录日志的工具类，它里面提供了公共的代码
 * @Author: 落亦-
 * @Date: 2020/3/21 8:56
 */
public class Logger {
    /**
     * 用于打印日志：计划让其在切入点方法执行之前执行(切入点方法就是业务层方法)
     */
    public void printLog(){
        System.out.println("Logger类中的printLog()开始记录日志...");
    }
}
