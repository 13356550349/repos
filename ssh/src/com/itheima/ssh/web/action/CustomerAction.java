package com.itheima.ssh.web.action;

import com.itheima.ssh.domain.Customer;
import com.itheima.ssh.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
    private Customer customer=new Customer();
    //注入CustomerService
    private CustomerService customerService;

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public Customer getModel() {
        return customer;
    }

    public String save(){
        System.out.println("CustomerAction执行了");
        customerService.save(customer);
        return NONE;
    }
}
