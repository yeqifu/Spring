package com.yeqifu;

import com.yeqifu.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: 落亦-
 * @Date: 2020/3/24 19:08
 *
 * 使用Junit单元测试：测试我们的配置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class AccountTxTest {

    @Autowired
    private  IAccountService as;

    @Test
    public  void testTransfer(){
        as.transfer("ccc","bbb",1000);

    }
}
