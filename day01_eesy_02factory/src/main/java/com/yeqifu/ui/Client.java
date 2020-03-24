package com.yeqifu.ui;

import com.yeqifu.factory.BeanFactory;
import com.yeqifu.service.IAccountService;

/**
 * 模拟一个表现层调用业务层
 * @Author: 落亦-
 * @Date: 2020/3/2 11:58
 */
public class Client {
    public static void main(String[] args) {
//        IAccountService accountService = new AccountServiceImpl();
        for (int i = 0; i < 5; i++) {
            IAccountService accountService = (IAccountService) BeanFactory.getBean("accountService");
            System.out.println(accountService);
        }
//        accountService.saveAccount();
    }
}
