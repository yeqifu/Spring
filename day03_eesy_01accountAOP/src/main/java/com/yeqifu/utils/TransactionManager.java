package com.yeqifu.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

/**
 * 和事务管理相关的工具类 包含了 开启事务，提交事务，回滚事务和释放连接
 * @author luoyi-
 */
@Component("transactionManager")
@Aspect
public class TransactionManager {

    @Autowired
    private ConnectionUtils connectionUtils;

    @Pointcut("execution(* com.yeqifu.service.impl.*.*(..))")
    private void pt1(){}

    /**
     * 开启事务
     */
    //@Before("pt1()")
    public void beginTransaction(){
        try {
            connectionUtils.getThreadConnection().setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 提交事务
     */
    //@AfterReturning("pt1()")
    public void commit(){
        try {
            connectionUtils.getThreadConnection().commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 回滚事务
     */
    //@AfterThrowing("pt1()")
    public void rollback(){
        try {
            connectionUtils.getThreadConnection().rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 释放连接
     */
    //@After("pt1()")
    public void release(){
        try {
            //还回连接池中
            connectionUtils.getThreadConnection().close();
            connectionUtils.removeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 环绕通知
     * @param pjp
     * @return
     */
    @Around("pt1()")
    public Object aroundTransaction(ProceedingJoinPoint pjp){
        Object rtValue = null;
        try {
            //1.开启事务
            this.beginTransaction();

            //得到方法执行所需要的参数
            Object[] args = pjp.getArgs();
            //2.执行操作
            rtValue = pjp.proceed(args);

            //3.提交事务
            this.commit();
            //4.返回结果
            return rtValue;
        } catch (Throwable e) {
            e.printStackTrace();
            //5.回滚操作
            this.rollback();
            throw new RuntimeException(e);

        }finally {
            //还回连接池中
            this.release();
        }
    }
}
