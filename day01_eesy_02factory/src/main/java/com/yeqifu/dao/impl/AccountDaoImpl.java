package com.yeqifu.dao.impl;

import com.yeqifu.dao.IAccountDao;

/**
 * @Author: 落亦-
 * @Date: 2020/3/2 11:57
 */
public class AccountDaoImpl implements IAccountDao {
    @Override
    public void saveAccount() {
        System.out.println("保存了账户");
    }
}
