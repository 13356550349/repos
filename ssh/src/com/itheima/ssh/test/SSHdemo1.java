package com.itheima.ssh.test;
import com.itheima.ssh.domain.Customer;
import com.itheima.ssh.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SSHdemo1 {
    @Resource(name = "customerService")
    private CustomerService customerService;
    @Test
    public void demo1(){
        Customer customer = customerService.findById(1l);
        customer.setCust_name("杜甫");
        customerService.update(customer);
    }

    @Test
    public void demo2(){
        List<Customer> list = customerService.findAllByHQL();
        for (Customer customer:list) {
            System.out.println(customer);
        }
    }

    @Test
    public void demo3(){
        List<Customer> list = customerService.findAllByQBC();
        for (Customer customer:list) {
            System.out.println(customer);
        }
    }
}
