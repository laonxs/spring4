package cn.ade.domain;

/**
 * 需求：实体类2
 *
 * @author ade
 * @version 1.0，2017-11-8 08:58:10
 */
public class Bean2  {

    /**
     * 成员变量 info
     */
    private String info;

    /**
     * 空参构造
     */
    public Bean2() {
        System.out.println("空参构造···");
    }

    /**
     * 测试方法
     */
    public void show() {
        System.out.println("show："+info);
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
