package cn.ade.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * 需求：通知增强Advice
 *
 * @author ade
 * @version 1.0，2017-11-9 14:37:14
 */
// @Component("userServiceAdvice2")
public class UserHelper2 {

    // 使用前置通知完成日志记录、权限控制

    /**
     * 无参的前置通知
     */
    public void before() {
        System.out.println("前置通知（无参）···");
    }

    /**
     * 有参的前置通知
     */
    public void before1(JoinPoint jp) {
        System.out.println("拦截的目标类:" + jp.getSignature().getDeclaringTypeName());
        System.out.println("拦截的方法名称:" + jp.getSignature().getName());
        System.out.println("前置通知（有参）···");
    }

    /**
     * 无参的后置通知
     */
    public void afterReturning() {
        System.out.println("后置通知（无参）···");
    }

    /**
     * 有参的后置通知
     * 注意：需要在配置文件中声明val
     */
    public void afterReturning1(JoinPoint jp, Object val) {
        // val：目标方法的返回值
        System.out.println(val);
        System.out.println("后置通知（有参）···");
    }

    // 应用最多，可以完成日志记录、权限控制、性能监测、事务管理

    /**
     * 环绕通知
     */
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前···");
        Object val = pjp.proceed();     // 执行目标行为
        System.out.println("环绕后···");
        return val;
    }

    /**
     * 无参的异常抛出通知
     */
    public void afterThrowing() {
        System.out.println("无参的异常抛出通知···");
    }

    /**
     * 有参的异常抛出通知
     * 注意：需要在配置文件中声明ex
     */
    public void afterThrowing1(JoinPoint jp, Throwable ex) {
        System.out.println(ex);     // 接收抛出的异常
        System.out.println("有参的异常抛出通知···");
    }

    // 资源释放

    /**
     * 无参的最终通知
     */
    public void after() {
        System.out.println("无参的最终通知···");
    }

    /**
     * 有参的最终通知
     */
    public void after1(JoinPoint jp) {
        System.out.println(jp.getSignature().getDeclaringTypeName());
        System.out.println(jp.getSignature().getName());
        System.out.println("有参的最终通知···");
    }

}
