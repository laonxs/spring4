package cn.ade.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

/**
 * 需求：CGLIB动态代理，cglib 可以为没有实现接口的类做代理，也可以为接口类做代理
 *
 * @author ade
 * @version 1.0，2017-11-8 20:35:54
 */
public class CglibProxyFactory implements MethodInterceptor {

    /** 目标对象 */
    private Object target;

    /**
     * 使用构造方法传递目标对象
     *
     * @param target
     */
    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 创建代理对象
     */
    public Object createProxy() {
        // 创建Enhancer对象
        Enhancer enhancer = new Enhancer();

        // 传递目标对象
        enhancer.setSuperclass(target.getClass());

        // 设置回调操作
        enhancer.setCallback(this);

        // 返回值
        return enhancer.create();
    }

    /**
     * 增强操作
     *
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("日志操作");
        return method.invoke(target, objects);
        /*return methodProxy.invokeSuper(o,objects);*/
    }

}
