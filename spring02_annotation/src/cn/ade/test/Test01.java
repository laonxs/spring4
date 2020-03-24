package cn.ade.test;

import cn.ade.service.UserService;
import cn.ade.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 需求：注解测试
 *
 * @author ade
 * @version 1.0，2017-11-8 16:28:30
 */
public class Test01 {

    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userService");
        userService.add();
        context.close();
    }

    @Test
    public void test02() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        UserService _userService = (UserService) applicationContext.getBean("userService");
        System.out.println(userService == _userService);
    }

}
