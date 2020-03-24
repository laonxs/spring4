package cn.ade.test.proxy;

import cn.ade.proxy.jdk.JDKProxyFactory;
import cn.ade.proxy.jdk.JDKProxyFactory2;
import cn.ade.service.UserService;
import cn.ade.service.impl.UserServiceImpl;
import org.junit.Test;

/**
 * 需求：jdk动态代理测试，jdk动态代理只针对于接口操作
 *
 * @author ade
 * @version 1.0，2017-11-8 20:08:47
 */
public class JDKProxyTest {

    @Test
    public void test01() {
        // 获取目标对象
        UserService userService = new UserServiceImpl();

        // 获取代理对象
         JDKProxyFactory factory = new JDKProxyFactory(userService);
//        JDKProxyFactory2 factory = new JDKProxyFactory2(userService);
        UserService _userService = (UserService) factory.createProxy();
        _userService.login();
    }

}
