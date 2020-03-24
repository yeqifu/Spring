package com.yeqifu.ui;

import com.yeqifu.service.impl.AccountServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 落亦-
 * @Date: 2020/3/2 19:17
 */
public class Client {
    public static void main(String[] args) {
        //获取核心容器
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        AccountServiceImpl accountService = (AccountServiceImpl) applicationContext.getBean("accountService");
        AccountServiceImpl accountService2 = (AccountServiceImpl) applicationContext.getBean("accountService");
        System.out.println(accountService==accountService2);*/

        //获取核心容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        AccountServiceImpl accountService = (AccountServiceImpl) applicationContext.getBean("accountService");
        accountService.saveAccount();
        //关闭容器
        applicationContext.close();
    }
}
