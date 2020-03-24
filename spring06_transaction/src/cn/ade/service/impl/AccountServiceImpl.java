package cn.ade.service.impl;

import cn.ade.dao.AccountDao;
import cn.ade.service.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 需求：转账模块的业务类
 *
 * @author ade
 * @version 1.0，2017-11-10 13:56:22
 */
@Service("accountService")
@Transactional
public class AccountServiceImpl implements AccountService {

    /** 转账模块的数据接口访问对象 */
    @Resource(name = "accountDao")
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    /**
     * 转账
     *
     * @param from 付款人
     * @param to 收款人
     * @param money 金额
     */
    @Override
    public void transferAccount(String from, String to, double money) {
        accountDao.inMoney(to, money);
        //int a = 10/0;
        accountDao.outMoney(from, money);
    }

}
