package cn.ade.utils;

import cn.ade.domain.Bean3;

/**
 * 需求：使用静态工厂的方法获取指定类的对象
 *
 * @author ade
 * @version 1.0，2017-11-8 09:29:04
 */
public class Bean3Factory {

    /**
     * 使用静态方法获取对象
     *
     * @return
     */
    public static Bean3 createBean3() {
        return new Bean3();
    }

    /**
     * 使用非静态方法获取对象
     *
     * @return
     */
    public Bean3 getBean3() {
        return new Bean3();
    }

}
