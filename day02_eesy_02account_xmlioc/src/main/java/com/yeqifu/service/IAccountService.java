package com.yeqifu.service;

import com.yeqifu.domain.Account;

import java.util.List;

/**
 * @author luoyi-
 */
public interface IAccountService {

    /**
     * 查询所有
     * @return
     */
    List<Account> findAllAccount();

    /**
     * 查询一个
     */
    Account findAccountById(Integer accountId);

    /**
     * 保存账户
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 更新账户
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 删除一个账户
     * @param accountId
     */
    void deleteAccount(Integer accountId);

}
