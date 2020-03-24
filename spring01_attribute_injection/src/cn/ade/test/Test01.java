package cn.ade.test;

import cn.ade.bean.CarBean;
import cn.ade.bean.CollectionBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 需求：属性注入测试
 *
 * @author ade
 * @version 1.0，2017-11-8 11:48:23
 */
public class Test01 {

    /**
     * 使用构造器注入属性，依赖的是满参构造
     */
    @Test
    public void test01() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CarBean car = (CarBean) applicationContext.getBean("car1");
        System.out.println(car);
    }

    /**
     * 使用setter方法注入属性，依赖的是set方法
     */
    @Test
    public void test02() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CarBean car = (CarBean) applicationContext.getBean("car2");
        System.out.println(car);
    }

    /**
     * 集合属性的注入
     */
    @Test
    public void test03() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionBean bean = (CollectionBean) applicationContext.getBean("collectionBean");
        System.out.println(bean.getList());
        System.out.println(bean.getSet());
        System.out.println(bean.getMap());
        System.out.println(bean.getProperties());
    }

}
