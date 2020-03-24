package com.yeqifu.service.impl;

import com.yeqifu.service.IAccountService;

/**
 * @Author: 落亦-
 * @Date: 2020/3/2 19:22
 */
public class AccountServiceImpl implements IAccountService {

    public AccountServiceImpl(){
        System.out.println("对象创建了");
    }

    @Override
    public void saveAccount() {
        System.out.println("保存账户");
    }

    public void init(){
        System.out.println("对象初始化了。。。。");
    }

    public void destory(){
        System.out.println("对象销毁了。。。。");
    }
}
