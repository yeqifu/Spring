package com.yeqifu.jdbctemplate;

import com.yeqifu.dao.IAccountDao;
import com.yeqifu.domain.Account;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 落亦-
 * @Date: 2020/3/22 18:00
 */
public class JdbcTemplate {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        IAccountDao accountDao = applicationContext.getBean("accountDao", IAccountDao.class);
        Account account = accountDao.findAccountById(8);
        System.out.println(account);
        account.setMoney(10000);
        account.setName("梅拉尼娅");
        accountDao.updateAccount(account);
        Account account2 = accountDao.findAccountByName("特朗普");
        System.out.println(account2);
    }
}
