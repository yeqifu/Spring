package com.yeqifu.service.impl;

import com.yeqifu.service.IAccountService;

/**
 * @Author: 落亦-
 * @Date: 2020/3/21 8:51
 */
public class AccountServiceImpl implements IAccountService {
    @Override
    public void saveAccount() {
        System.out.println("保存了账户");
//        System.out.println(5/0);
    }

    @Override
    public void updateAccount(Integer i) {
        System.out.println("更新了账户");
    }

    @Override
    public int deleteAccount() {
        System.out.println("删除了账户");
        return 0;
    }
}
