package cn.ade.test;

import cn.ade.domain.Bean2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 需求：DI的快速入门
 *
 * @author ade
 * @version 1.0，2017-11-8 09:00:30
 */
public class Test02 {

    /**
     * DI的快速入门，也就是在Spring创建对象的过程中，对象所依赖的属性通过配置注入对象
     */
    @Test
    public void test01() {
        // ClassPathXmlApplicationContext类会在classpath路径下查找，也就是编译后的classes路径下
        // 创建实用的Bean工厂对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 获取指定类的对象
        Bean2 bean2 = (Bean2) context.getBean("bean2");

        // 执行对象方法
        System.out.println(bean2.getInfo());
        bean2.show();
    }

}
