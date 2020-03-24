package cn.ade.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 需求：jdk的动态代理，jdk动态代理只针对于接口操作
 *
 * @author ade
 * @version 1.0，2017-11-8 19:43:48
 */
public class JDKProxyFactory {

    /** 目标对象 */
    private Object target;

    /**
     * 构造函数
     */
    public JDKProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 创建代理对象
     */
    public Object createProxy() {
        /**
         * 第一个参数：目标类的类加载器对象
         * 第二个参数：目标类的实现集合数组class[]
         * 第三个参数：invocationHandler，接口，它的作用是是代理实例的调用处理程序
         *
         * 返回值：一个带有代理类的指定调用处理程序的代理实例，它由指定的类加载器定义，并实现指定的接口
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new
                InvocationHandler() {
            // 增强部分
            // 匿名内部类
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("日志操作");
                return method.invoke(target, args);
            }
        });
    }

}
