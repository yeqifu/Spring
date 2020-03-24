package com.yeqifu.factory;

import com.yeqifu.service.IAccountService;
import com.yeqifu.service.impl.AccountServiceImpl;

/**
 * 静态工厂创建实例
 * @Author: 落亦-
 * @Date: 2020/3/2 21:16
 */
public class StaticFactory {
    public static IAccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
