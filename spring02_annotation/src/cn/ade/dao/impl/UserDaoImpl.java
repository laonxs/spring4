package cn.ade.dao.impl;

import cn.ade.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * 需求：用户数据访问类
 *
 * @author ade
 * @version 1.0，2017-11-8 16:47:07
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("UserDaoImpl ···");
    }

}
