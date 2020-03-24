package cn.ade.service.impl;

import cn.ade.dao.UserDao;
import cn.ade.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * 需求：用户业务类
 *
 * @author ade
 * @version 1.0，2017-11-8 16:24:55
 */
// @Component("userService")
@Service("userService")
@Scope("singleton")
public class UserServiceImpl implements UserService {

    /**
     * 简单属性的注入
     */
    @Value("张三")
    private String name;

    /**
     * 复杂属性的注入
     */
    /*@Autowired    // 默认是根据类型进行注入
     *@Qualifier("userDao") // 一起使用时，可以根据名称进行注入，或者直接用@Resource来替代
    */
    @Resource(name = "userDao")
    private UserDao userDao;

    // @Value @Autowired 它们可以修饰属性，也可以修饰 setter 方法，如果写在属性上，就不需要提供 setter 方法

    @Override
    public void add() {
        System.out.println("UserServiceImpl···" + name);
        userDao.add();
    }

    @PostConstruct
    public void myInitMethod() {
        System.out.println("初始化");
    }

    @PreDestroy     // 自定义destroy方法只对singleton方法才有效
    public void myDestroyMethod() {
        System.out.println("销毁");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}
