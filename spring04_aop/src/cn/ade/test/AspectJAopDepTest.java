package cn.ade.test;

import cn.ade.service.CustomerService;
import cn.ade.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 需求：基于AspectJ切面传统开发
 *
 * @author ade
 * @version 1.0，2017-11-9 11:28:41
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AspectJAopDepTest {

    @Autowired
    private UserService userService;

//    @Autowired
//    private CustomerService customerService;

    @Test
    public void test01() {
        userService.login();
    }

//    @Test
//    public void test02() {
//        customerService.add();
//    }

}
