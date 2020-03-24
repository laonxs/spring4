package cn.ade.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 需求：实体类2
 *
 * @author ade
 * @version 1.0，2017-11-8 08:58:10
 */
public class Bean4 implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {

    /**
     * 成员变量
     */
    private String info;

    /**
     * 空参构造
     * 在加载配置文件的时候，或者getBean的时候
     */
    public Bean4() {
        System.out.println("第一步：Bean4的实例化");
    }

    /**
     * 对成员变量info进行赋值
     *
     * @param info
     */
    public void setInfo(String info) {
        System.out.println("第二步：Bean4的属性注入");
        this.info = info;
    }

    /**
     * 如果 Bean 实现 BeanNameAware 执行 setBeanName
     *
     * @param s
     */
    @Override
    public void setBeanName(String s) {
        System.out.println("第三步：获取bean的id或name值："+s);
    }

    /**
     * 如果 Bean 实现 BeanFactoryAwar 或 ApplicationContextAwar 设置工厂 setBeanFactory 或上下文对象 setApplicationContext
     *
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("第四步：得到ApplicationContext对象："+applicationContext);
    }

    /**
     * 如果 Bean 实现 InitializingBean 执行 afterPropertiesSet
     *
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("第六步：属性注入完成后···");
    }

    /**
     * 调用自定义的 init-method 方法
     */
    public void MyInitMethod() {
        System.out.println("第七步：自定义的初始化方法");
    }


    /**
     * 测试方法
     */
    public void show() {
        System.out.println("第九步：执行业务操作");
    }

    /**
     * 如果 Bean 实现 DisposableBean 执行 destroy
     *
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("第十步：销毁");
    }

    /**
     * 调用自定义的 destroy-method，destroy-method 只对 scope=singleTon 有效果
     */
    public void MyDestroyMethod() {
        System.out.println("第十一步：自定义的销毁方法");
    }

}
