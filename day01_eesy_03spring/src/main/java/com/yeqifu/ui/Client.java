package com.yeqifu.ui;

import com.yeqifu.service.IAccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {
    /**
     * 获取spring的Ioc核心容器，并根据id获取对象
     *
     * ApplicationContext的三个常用实现类：
     *      ClassPathXmlApplicationContext:它可以加载类路径下的配置文件，要求配置文件必须在类路径下。不在的话，加载不了
     *      FileSystemXmlApplicationContext:它可以加载磁盘任意路径下的配置文件(必须有访问权限)
     *      AnnotationConfigApplicationContext:它是用于读取注解创建容器的
     *
     * 核心容器的两个接口的不同：
     *  ApplicationContext:     单例对象适用      使用较多
     *      它在构建核心容器时，创建对象采取的策略是采用立即加载的方式。也就是说，只要一读取完配置文件马上就创建配置文件中配置的对象
     *  BeanFactory:            多例对象适用
     *      它在构建核心容器时，创建对象采取的策略是采用延迟加载的方式。也就是说，什么时候根据id获取对象了，什么时候才真正创建对象
     * @param args
     */
    public static void main(String[] args) {
        //通过ApplicationContext创建核心容器   立即加载对象
        //1.获取核心容器对象
        /*ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        ApplicationContext ac = new FileSystemXmlApplicationContext("c:\\Users\\yqf\\Desktop\\bean.xml");

        //2.根据id获取bean对象
        IAccountService as = (IAccountService)ac.getBean("accountService");
        IAccountDao adao = ac.getBean("accountDao",IAccountDao.class);
        System.out.println(as);
        System.out.println(adao);
        as.saveAccount();*/

        System.out.println("***********************************************");

        //通过BeanFactory创建ApplicationContext创建核心容器   延迟加载对象
        //获取核心容器
        Resource resource=new ClassPathResource("bean.xml");
        BeanFactory bf = new XmlBeanFactory(resource);
        //根据ID获取bean对象
        IAccountService accountService = (IAccountService) bf.getBean("accountService");
        System.out.println(accountService);

    }
}
