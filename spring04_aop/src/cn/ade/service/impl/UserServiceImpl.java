package cn.ade.service.impl;

import cn.ade.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 需求：用户模块的业务类
 *
 * @author ade
 * @version 1.0，2017-11-8 19:41:17
 */
//@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public String login() {
        // System.out.println(10/0);
        System.out.println("login···");
        return "hello";
    }

    @Override
    public void register() {
        System.out.println("register···");
    }
}
