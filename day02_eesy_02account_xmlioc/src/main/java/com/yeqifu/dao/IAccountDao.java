package com.yeqifu.dao;

import com.yeqifu.domain.Account;

import java.util.List;

/**
 * @author luoyi-
 */
public interface IAccountDao {
    /**
     * 查询所有账户
     * @return
     */
    public List<Account> findAllAccount();

    /**
     * 通过账户ID查询一个账户
     * @param accountId
     * @return
     */
    public Account findAccountById(Integer accountId);

    /**
     * 保存一个账户
     * @param account
     */
    public void saveAccount(Account account);

    /**
     * 更新一个账户
     * @param account
     */
    public void updateAccount(Account account);

    /**
     * 删除一个账户
     * @param accountId
     */
    public void deleteAccount(Integer accountId);
}
