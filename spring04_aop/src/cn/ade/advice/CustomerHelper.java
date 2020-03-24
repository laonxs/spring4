package cn.ade.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 需求：顾客模块的通知增强Advice
 *
 * @author ade
 * @version 1.0，2017-11-9 16:46:52
 */
@Component
@Aspect         // 声明当前的bean就是一个切面
public class CustomerHelper {

    /**
     * 前置通知
     *
     * @param jp
     */
    @Before("execution(* cn.ade.service.CustomerService.*(..))")
    public void before(JoinPoint jp) {
        System.out.println(jp.getSignature().getDeclaringTypeName());
        System.out.println(jp.getSignature().getName());
        System.out.println("前置通知");
    }

    /**
     * 后置通知
     *
     * @param jp
     * @param value
     */
    @AfterReturning(value = "execution(* cn.ade.service.CustomerService.*(..))",returning = "value")
    public void afterReturning(JoinPoint jp, Object value) {
        System.out.println("目标方法的返回值是："+value);
        System.out.println("后置通知");
    }

    /**
     * 环绕通知
     *
     * @param pjp
     * @return
     * @throws Throwable
     */
    @Around("execution(* cn.ade.service.CustomerService.*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前···");
        Object value = pjp.proceed();
        System.out.println("环绕后···");
        return value;
    }

    /**
     * 异常抛出通知
     *
     * @param jp
     * @param ex
     */
    @AfterThrowing(value = "execution(* cn.ade.service.CustomerService.*(..))",throwing = "ex")
    public void afterThrowing(JoinPoint jp, Throwable ex) {
        System.out.println("抛出的异常："+ex);
        System.out.println("异常抛出通知···");
    }

    /**
     * 最终通知
     */
    @After("execution(* cn.ade.service.CustomerService.*(..))")
    public void after() {
        System.out.println("最终通知");
    }

}
