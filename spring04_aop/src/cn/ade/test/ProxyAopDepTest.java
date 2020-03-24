package cn.ade.test;

import cn.ade.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 需求：经典的基于代理的Aop开发
 *
 * @author ade
 * @version 1.0，2017-11-9 09:32:59
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ProxyAopDepTest {

    @Resource(name = "userServiceProxy")       // 因为aop1.xml中配置了两个userService，所以必须指定名称
    private UserService userService;

    @Test
    public void test01() {
        userService.login();
        userService.register();
    }

}
