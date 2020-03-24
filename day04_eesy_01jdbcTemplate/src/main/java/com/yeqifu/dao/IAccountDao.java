package com.yeqifu.dao;

import com.yeqifu.domain.Account;

/**
 * @Author: 落亦-
 * @Date: 2020/3/22 17:45
 */
public interface IAccountDao {
    /**
     * 通过ID查找一个账户
     * @param accountId
     * @return 返回一个account
     */
    Account findAccountById(Integer accountId);

    /**
     * 通过账户名查找一个账户
     * @param accountName
     * @return 返回一个account
     */
    Account findAccountByName(String accountName);

    /**
     * 更新一个账户
     * @param account
     */
    void updateAccount(Account account);
}
