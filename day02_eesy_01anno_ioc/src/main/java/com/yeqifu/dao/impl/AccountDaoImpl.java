package com.yeqifu.dao.impl;

import com.yeqifu.dao.IAccountDao;
import org.springframework.stereotype.Repository;

/**
 * 账户的持久层实现类
 * @author luoyi-
 */
@Repository(value = "accountDao1")
public class AccountDaoImpl implements IAccountDao {

    @Override
    public  void saveAccount(){

        System.out.println("保存了账户");
    }
}
