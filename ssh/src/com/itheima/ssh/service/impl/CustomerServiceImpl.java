package com.itheima.ssh.service.impl;

import com.itheima.ssh.dao.CustomerDao;
import com.itheima.ssh.domain.Customer;
import com.itheima.ssh.service.CustomerService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void save(Customer customer) {
        customerDao.save(customer);
    }

    @Override
    public void update(Customer customer) {
        customerDao.update(customer);
    }

    @Override
    public void delete(Customer customer) {
        customerDao.delete(customer);
    }

    @Override
    public Customer findById(Long id) {
        return customerDao.findById(id);

    }

    @Override
    public List<Customer> findAllByHQL() {
        return customerDao.findAllByHQL();
    }

    @Override
    public List<Customer> findAllByQBC() {
        return customerDao.findAllByQBC();
    }
}
