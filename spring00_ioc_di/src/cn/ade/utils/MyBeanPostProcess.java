package cn.ade.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 需求：定义BeanPostProcessor的实现类
 *
 * @author ade
 * @version 1.0，2017-11-11 09:20:16
 */
public class MyBeanPostProcess implements BeanPostProcessor {

    /**
     * 如果存在类实现 BeanPostProcess(后处理 Bean),执行 postProcessBeforeInitialization
     *
     * @param o
     * @param s
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("第五步：存在类实现 BeanPostProcess(后处理 Bean),执行 postProcessBeforeInitialization");
        return o;
    }

    /**
     * 如果存在类实现 BeanPostProcessor(处理 Bean),执行 postProcessAfterInitialization
     *
     * @param o
     * @param s
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("第八步：存在类实现 BeanPostProcessor(处理 Bean),执行 postProcessAfterInitialization");
        return o;
    }

}
