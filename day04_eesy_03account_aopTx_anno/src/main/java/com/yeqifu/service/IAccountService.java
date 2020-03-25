package com.yeqifu.service;

import com.yeqifu.domain.Account;

import java.util.List;

/**
 * @Author: 落亦-
 * @Date: 2020/3/24 18:34
 */
public interface IAccountService {

    /**
     * 查询所有
     * @return
     */
    List<Account> findAllAccount();

    /**
     * 查询一个
     * @return
     */
    Account findAccountById(Integer accountId);

    /**
     * 保存
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 更新
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 删除
     * @param acccountId
     */
    void deleteAccount(Integer acccountId);

    /**
     * 转账
     * @param sourceName        转出账户名称
     * @param targetName        转入账户名称
     * @param money             转账金额
     */
    void transfer(String sourceName, String targetName, Integer money);

    //void test();//它只是连接点，但不是切入点，因为没有被增强

}
