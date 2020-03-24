package cn.ade.test;

import cn.ade.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 需求：转账测试
 *
 * @author ade
 * @version 1.0，2017-11-10 14:07:42
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TransferAccountTest {

    /** 转账模块的业务类对象 */
    @Resource(name = "accountService")
    private AccountService accountService;

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    /**
     * 测试
     */
    @Test
    public void transferAccount() {
        accountService.transferAccount("张三","李四", 10);
        System.out.println("转账成功");
    }
}
