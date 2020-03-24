package com.yeqifu.service.impl;

import com.yeqifu.dao.IAccountDao;
import com.yeqifu.dao.impl.AccountDaoImpl;
import com.yeqifu.service.IAccountService;

/**
 * @author luoyi-
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao = new AccountDaoImpl();

    public AccountServiceImpl(){
        System.out.println("对象创建了");
    }

    @Override
    public void  saveAccount(){
        accountDao.saveAccount();
    }
}
