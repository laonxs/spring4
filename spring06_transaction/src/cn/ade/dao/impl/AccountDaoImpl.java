package cn.ade.dao.impl;

import cn.ade.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * 需求：转账模块的数据访问类
 *
 * @author ade
 * @version 1.0，2017-11-10 14:00:49
 */
@Component("accountDao")
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

   /* @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }*/

    @Override
    public void inMoney(String to, double money) {
        /*ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        jdbcTemplate = (JdbcTemplate)context.getBean("jdbcTemplate");*/
        this.getJdbcTemplate().update("update account set money = money + ? WHERE name = ?",money, to);
    }

    @Override
    public void outMoney(String from, double money) {
        /*ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        jdbcTemplate = (JdbcTemplate)context.getBean("jdbcTemplate");*/
        this.getJdbcTemplate().update("update account set money = money - ? WHERE name = ?", money, from);
    }

}
