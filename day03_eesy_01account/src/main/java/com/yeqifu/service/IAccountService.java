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
     * @param accountId
     * @return
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

    /**
     * 转账
     * @param sourceName    转出账户名称
     * @param targetName    转入账户名称
     * @param money         转账金额
     */
    void transfer(String sourceName,String targetName,Float money);

    /**
     * 此方法只是连接点，不是切入点，切入点可以理解为业务层中被增强的方法，而连接点只是业务层中的方法
     * 所有的切入点都是连接点，但连接点却不一定是切入点
     */
    void test(String s);
}
