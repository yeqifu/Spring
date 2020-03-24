package com.yeqifu.proxy;

/**
 * 被代理类要实现的接口
 * @Author: 落亦-
 * @Date: 2020/3/20 10:06
 */
public interface IProducer {

    /**
     * 销售产品
     * @param money     销售产品的价格
     */
    public void saleProduct(float money);

    /**
     * 售后服务
     * @param money     售后服务的价格
     */
    public void afterService(float money);
}
