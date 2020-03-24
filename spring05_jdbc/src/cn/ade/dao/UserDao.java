package cn.ade.dao;

import cn.ade.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * 需求：用户模块的数据接口访问类
 *
 * @author ade
 * @version 1.0，2017-11-9 21:15:16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserDao {

    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate template;

    /**
     * JdbcTemplate的快速入门
     */
    @Test
    public void test01() {
        // 创建数据库连接池
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        // 设置数据库连接池的属性
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring");
        dataSource.setUsername("root");
        dataSource.setPassword("1234");

        // 创建JdbcTemplate
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(dataSource);

        // 执行数据库操作
        template.execute("update user set username = '张三' where id = 1 ");
    }

    /**
     * 配置Spring内置数据库连接池
     */
    @Test
    public void test02() {
        template.execute("update user set username = '李四' where id = 2 ");
    }

    /**
     * 简单数据的返回
     */
    @Test
    public void test03() {
        String s = template.queryForObject("select username from user where id = ?", String.class, 1);
        Integer count = template.queryForObject("select count(*) from user", Integer.class);
        System.out.println(s);
        System.out.println(count);
    }

    /**
     * 复杂数据的返回:一条数据
     */
    @Test
    public void test04() {
        User user = template.queryForObject("select * from user where id = ?", new RowMapper<User>() {

            @Override
            public User mapRow(ResultSet rs, int i) throws SQLException {
                User _user = new User();
                _user.setId(rs.getInt("id"));
                _user.setUsername(rs.getString("username"));
                _user.setPassword(rs.getString("password"));
                return _user;
            }

        }, 1);

        System.out.println(user);
    }

    /**
     * 复杂数据的返回：多条数据
     */
    @Test
    public void test05() {
        List<User> list = template.query("select * from user", new RowMapper<User>() {

            @Override
            public User mapRow(ResultSet rs, int i) throws SQLException {
                User _user = new User();
                _user.setId(rs.getInt("id"));
                _user.setUsername(rs.getString("username"));
                _user.setPassword(rs.getString("password"));
                return _user;
            }

        });

        System.out.println(list);
    }

    /**
     * 复杂数据的返回
     */
    @Test
    public void test06() {
        List<User> list = template.query("select * from user", new BeanPropertyRowMapper<User>(User.class));
        System.out.println(list);
    }

}
