package cn.ade.test;

import cn.ade.domain.Bean3;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 需求：Bean的实例化方式
 *
 * @author ade
 * @version 1.0，2017-11-8 09:32:48
 */
public class Test04 {

    /*使用空参构造实例化对象，见Test1。对于这种方式，注意 Bean 类中必须提供无参数构造*/

    /**
     * 使用静态工厂方法实例化对象
     *
     */
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Bean3 bean3 = (Bean3) context.getBean("bean3");

        bean3.show();
    }

    /**
     * 使用实例工厂方法实例化对象
     */
    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Bean3 bean3 = (Bean3) context.getBean("bean3");

        bean3.show();
    }

}
