package com.yeqifu.service;

/**
 * @Author: 落亦-
 * @Date: 2020/3/21 8:49
 */
public interface IAccountService {

    /**
     * 保存账户
     */
    void saveAccount();

    /**
     * 更新账户
     * @param i     账户ID
     */
    void updateAccount(Integer i);

    /**
     * 删除账户
     * @return
     */
    int deleteAccount();

}
