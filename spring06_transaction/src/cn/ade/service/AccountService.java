package cn.ade.service;

/**
 * 需求：转账模块的业务接口
 *
 * @author ade
 * @version 1.0，2017-11-10 13:54:35
 */
public interface AccountService {

    void transferAccount(String from, String to, double money);

}
