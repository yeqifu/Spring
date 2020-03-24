package com.yeqifu.dao;

import com.yeqifu.domain.Account;

import java.util.List;

/**
 * @author luoyi-
 */
public interface IAccountDao {
    public List<Account> findAllAccount();

    public Account findAccountById(Integer accountId);

    public void saveAccount(Account account);

    public void updateAccount(Account account);

    public void deleteAccount(Integer accountId);
}
