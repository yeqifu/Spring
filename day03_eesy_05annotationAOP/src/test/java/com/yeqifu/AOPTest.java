package com.yeqifu;

import com.yeqifu.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 落亦-
 * @Date: 2020/3/21 9:08
 */
public class AOPTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService accountService = (IAccountService) ac.getBean("accountService");
        accountService.saveAccount();
        /*accountService.updateAccount(2);
        accountService.deleteAccount();*/
    }
}
