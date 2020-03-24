package com.yeqifu.proxy;

/**
 * @Author: 落亦-
 * @Date: 2020/3/20 10:06
 */
public class Producer implements IProducer{
    /**
     * 销售产品
     * @param money     销售产品的价格
     */
    @Override
    public void saleProduct(float money) {
        System.out.println("成功销出产品,销出价格为："+money);
    }

    /**
     * 售后服务
     * @param money     售后服务的价格
     */
    @Override
    public void afterService(float money) {
        System.out.println("进行售后服务，收费为："+money);
    }
}
