package cn.ade.test;

import cn.ade.domain.Bean1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 需求：测试Bean的作用域
 *
 * @author ade
 * @version 1.0，2017-11-8 09:50:05
 */
public class Test05 {

    /**
     * Bean的作用域
     *      singleton：单例，代表在Spring ioc容器中只有一个Bean实例（默认）
     *      prototype：多例，每次从Spring容器中获取，都会创建一个新的实例
     *      request：web开发中，会将bean存储到request域中
     *      session：web开发中，会将bean存储到session域中
     */
    @Test
    public void test01() {
        // singleton
        /*ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean1 bean1 = (Bean1) context.getBean("bean1");
        Bean1 _bean1 = (Bean1) context.getBean("bean1");
        System.out.println(bean1 == _bean1);        // true*/

        // prototype
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean1 bean1 = (Bean1) context.getBean("bean1");
        Bean1 _bean1 = (Bean1) context.getBean("bean1");
        System.out.println(bean1 == _bean1);        // false
    }

}
