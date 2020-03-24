package com.yeqifu.factory;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 通过工厂模式解耦
 * @Author: 落亦-
 * @Date: 2020/3/2 12:24
 */
public class BeanFactory {

    /**
     * 声明一个properties对象读取配置文件
     */
    private static Properties properties;

    /**
     * 声明一个map用于存储对象
     */
    private static Map<String,Object> beans;


    /**
     * 静态代码块读取配置文件
     */
    static{
        //实例化properties对象
        properties = new Properties();
        //通过类加载器调用getResourceAsStream加载配置文件
        InputStream inputStream = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        beans = new HashMap<String, Object>(16);
        try {
            properties.load(inputStream);
            //将properties中的所有key取出来
            Enumeration<Object> keys = properties.keys();
            while (keys.hasMoreElements()){
                //取出每个key
                String key = keys.nextElement().toString();
                //根据key获取value
                String beanPath = properties.getProperty(key);
                Object value = Class.forName(beanPath).newInstance();
                //将key对象的实例对象存储到beans中，下次调用getBean时，调用已经创建好的实例对象
                beans.put(key,value);
            }
        } catch (Exception e) {
            throw new ExceptionInInitializerError("初始化properties失败");
        }
    }

    /**
     * 根据bean的名称获取bean的对象
     * @param beanName
     * @return
     */
    public static Object getBean(String beanName){
        return beans.get(beanName);
    }


}
