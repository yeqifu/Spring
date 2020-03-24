package com.yeqifu.service.impl;

import com.yeqifu.dao.IAccountDao;
import com.yeqifu.domain.Account;
import com.yeqifu.service.IAccountService;

import java.util.List;

/**
 * @author luoyi-
 */
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAllAccount() {
        //2.执行操作
        List<Account> accounts = accountDao.findAllAccount();
        //4.返回结果
        return accounts;
    }

    @Override
    public Account findAccountById(Integer accountId) {
        //2.执行操作
        Account account = accountDao.findAccountById(accountId);
        //4.返回结果
        return account;
    }

    @Override
    public void saveAccount(Account account) {
        //2.执行操作
        accountDao.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        //2.执行操作
        accountDao.updateAccount(account);
    }

    @Override
    public void deleteAccount(Integer accountId) {
        //2.执行操作
        accountDao.deleteAccount(accountId);
    }

    /**
     * @param sourceName 转出账户名称
     * @param targetName 转入账户名称
     * @param money      转账金额
     */
    @Override
    public void transfer(String sourceName, String targetName, Float money) {
        System.out.println("开始执行事务...");
        //2.1根据名称查询转出账户
        Account source = accountDao.findAccountByName(sourceName);
        //2.2根据名称查询转入账户
        Account target = accountDao.findAccountByName(targetName);
        //2.3转出账户减钱
        source.setMoney(source.getMoney() - money);
        //2.4转入账户加钱
        target.setMoney(target.getMoney() + money);
        //2.5更新转出账户
        accountDao.updateAccount(source);

//        int i = 1 / 0;

        //2.6更新转入账户
        accountDao.updateAccount(target);
    }

    @Override
    public void test(String s) {
        System.out.println("业务层中未被增强的方法");
    }

}
