package cn.ade.test;

import cn.ade.domain.Bean1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 需求：IOC的快速入门，inversion of Controller 控制反转
 *
 * @author ade
 * @version 1.0，2017-11-8 09:00:30
 */
public class Test01 {

    /**
     * IOC的快速入门，也就是对象实例化的权利由Spring容器来管理
     * IOC：inversion of Controller 控制反转
     * ApplicationContext会在配置文件加载时，就会初始化所有的bean
     * 问题：当scope=prototype的时候，getBean的时候才会实例化Bean？
     */
    @Test
    public void test01() {
        // ApplicationContext是BeanFactory的一个子接口， ClassPathXmlApplicationContext是AppliCationContext的实现类
        // ClassPathXmlApplicationContext类会在classpath路径下查找，也就是编译后的classes路径下；
        // FileSystemXmlAppliCationContext类根据文件路径获取
        // 创建实用的Bean工厂对象，在加载ApplicationContext配置文件的时候，即创建所有配置文件中的对象，立刻加载
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 获取指定类的对象
        Bean1 bean1 = (Bean1) context.getBean("bean1");

        // 执行对象方法
        bean1.show();
    }

}
