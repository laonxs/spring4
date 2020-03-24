package cn.ade.dao;

/**
 * 需求：转账模块的数据访问接口
 *
 * @author ade
 * @version 1.0，2017-11-10 14:00:26
 */
public interface AccountDao {

    void inMoney(String to, double money);

    void outMoney(String from, double money);

}
