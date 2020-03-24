package cn.ade.service.impl;

import cn.ade.service.CustomerService;
import org.springframework.stereotype.Service;

/**
 * 需求：顾客模块的业务类
 *
 * @author ade
 * @version 1.0，2017-11-9 16:43:22
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Override
    public String add() {
        System.out.println("add···");
        return "返回值：add";
    }

    @Override
    public void show() {
        System.out.println("show···");
    }

    @Override
    public void update() {
        System.out.println("update···");
    }

    @Override
    public void delete() {
        System.out.println("delete···");
    }

}
