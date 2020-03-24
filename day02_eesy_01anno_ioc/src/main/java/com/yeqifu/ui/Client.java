package com.yeqifu.ui;


import com.yeqifu.service.IAccountService;
import com.yeqifu.service.impl.AccountServiceImpl;
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
        //2.根据id获取bean对象
        IAccountService as = (IAccountService)ac.getBean("accountService");
        System.out.println(as);
        IAccountService as2 = ac.getBean("accountService", AccountServiceImpl.class);
        System.out.println(as == as2);

        /*IAccountDao adao = ac.getBean("accountDao", IAccountDao.class);
        System.out.println(adao);*/
        as.saveAccount();

        ((ClassPathXmlApplicationContext) ac).close();
    }
}
