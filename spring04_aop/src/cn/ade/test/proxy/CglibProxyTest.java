package cn.ade.test.proxy;

import cn.ade.proxy.cglib.CglibProxyFactory;
import cn.ade.service.UserService;
import cn.ade.service.impl.UserServiceImpl;
import org.junit.Test;

/**
 * 需求：CGLIB动态代理测试
 *
 * @author ade
 * @version 1.0，2017-11-8 20:42:20
 */
public class CglibProxyTest {

    @Test
    public void test01() {
        UserService userService = new UserServiceImpl();
        CglibProxyFactory factory = new CglibProxyFactory(userService);
        UserService _userService = (UserService) factory.createProxy();
        _userService.login();

    }

}
