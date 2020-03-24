package com.yeqifu.service.impl;

import com.yeqifu.dao.IAccountDao;
import com.yeqifu.factory.BeanFactory;
import com.yeqifu.service.IAccountService;

/**
 * @Author: 落亦-
 * @Date: 2020/3/2 11:55
 */
public class AccountServiceImpl implements IAccountService {

//    IAccountDao accountDao = new AccountDaoImpl();

    IAccountDao accountDao = (IAccountDao) BeanFactory.getBean("accountDao");



    @Override
    public void saveAccount() {
        accountDao.saveAccount();
        System.out.println(accountDao);
    }
}
