package cn.ade.test;

import cn.ade.domain.Bean4;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 需求：Bean的生命周期
 *
 * @author ade
 * @version 1.0，2017-11-8 09:50:05
 */
public class Test06 {

    /**
     * Bean的生命周期:
     *      1 instantiate bean 对象实例化，调用构造函数，初始化实例
     *      2 populate properties 封装属性
     *      3. 如果 Bean 实现 BeanNameAware 执行 setBeanName
     *      4. 如果 Bean 实现 BeanFactoryAwar 或 ApplicationContextAwar 设置工厂 setBeanFactory 或上下文对象 setApplicationContext
     *      5. 如果存在类实现 BeanPostProcess(后处理 Bean),执行 postProcessBeforeInitialization
     *      6. 如果 Bean 实现 InitializingBean 执行 afterPropertiesSet
     *      7. 调用自定义的 init-method 方法
     *      8. 如果存在类实现 BeanPostProcessor(处理 Bean),执行 postProcessAfterInitialization
     *      9. 执行业务处理
     *      10. 容器被关闭
     *      11. 如果 Bean 实现 DisposableBean 执行 destroy
     *      12. 调用自定义的 destroy-method，对于销毁的方法它只对 bean 的 scope=singleton 有效
     */
    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean4 bean4 = (Bean4) context.getBean("bean4");
        bean4.show();
        context.close();
    }

}
