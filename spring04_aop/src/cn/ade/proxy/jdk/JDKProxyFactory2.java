package cn.ade.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 需求：jdk的动态代理
 *
 * @author ade
 * @version 1.0，2017-11-8 19:43:48
 */
public class JDKProxyFactory2 implements InvocationHandler {

    /** 目标对象 */
    private Object target;

    /**
     * 构造函数
     */
    public JDKProxyFactory2(Object target) {
        this.target = target;
    }

    /**
     * 创建代理对象
     */
    public Object createProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
    }

    /**
     * InvocationHandler 是代理实例的调用处理程序实现的接口。每个代理实例都具有一个关联的调用处理程序。
     * 对代理实例调用方法时，将对方法调用进行编码并将其指派到它的调用处理程序的 invoke 方法
     * 这个方法，底层自己会调用
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("日志操作");
        return method.invoke(target,args);
    }
}
