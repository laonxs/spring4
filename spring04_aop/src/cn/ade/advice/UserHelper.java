package cn.ade.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 需求：通知增强Advice
 *
 * @author ade
 * @version 1.0，2017-11-9 09:19:41
 */
//@Component
public class UserHelper implements MethodBeforeAdvice, AfterReturningAdvice, MethodInterceptor {

    /**
     * 前置通知
     *
     * @param method
     * @param objects
     * @param o
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置通知···");
    }

    /**
     * 通知后置
     *
     * @param o
     * @param method
     * @param objects
     * @param o1
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("后置通知···");
    }

    /**
     * 环绕通知
     *
     * @param mi
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        System.out.println("环绕前···");
        Object value = mi.proceed();
        System.out.println("环绕后···");
        return value;
    }

}
