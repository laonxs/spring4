package cn.ade.test;

import cn.ade.domain.Bean1;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * 需求：BeanFactory与ApplicationContext的区别
 *
 * @author ade
 * @version 1.0，2017-11-8 09:22:06
 */
public class Test03 {

    /**
     * 测试BeanFactory的加载过程
     * BeanFactory采用的延迟加载策略，也就是在真正的getBean的时候，才会实例化bean
     * 注意断点的位置，在实例化的位置
     */
    @Test
    public void test01() {
        // 创建BeanFactory对象，采用延迟加载的策略
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));

        // 创建指定类的对象，而且也只加载指定的类，而不是配置文件中全部的类
        Bean1 bean1 = (Bean1) factory.getBean("bean1");

        // 执行指定的方法
        bean1.show();
    }

}
