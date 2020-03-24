package com.yeqifu.dao.impl;

import com.yeqifu.dao.IAccountDao;

/**
 * @author luoyi-
 * 账户的持久层实现类
 */
public class AccountDaoImpl implements IAccountDao {

    @Override
    public  void saveAccount(){

        System.out.println("保存了账户");
    }
}
