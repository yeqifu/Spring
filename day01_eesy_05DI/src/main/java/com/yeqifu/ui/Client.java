package com.yeqifu.ui;


import com.yeqifu.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟一个表现层，用于调用业务层
 * @author luoyi-
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //1.获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        ApplicationContext ac = new FileSystemXmlApplicationContext("c:\\Users\\yqf\\Desktop\\bean.xml");

        //2.根据id获取bean对象
/*        IAccountService as = (IAccountService)ac.getBean("accountService");
        as.saveAccount();*/

        IAccountService as = (IAccountService)ac.getBean("accountService2");
        as.saveAccount();

        /*IAccountService as = (IAccountService)ac.getBean("accountService3");
        as.saveAccount();*/
    }
}
