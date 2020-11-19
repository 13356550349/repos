package com.itheima.ssh.service;

import com.itheima.ssh.domain.Customer;

import java.util.List;

public interface CustomerService {
    public void save(Customer customer);
    public void update(Customer customer);
    public void delete(Customer customer);
    public Customer findById(Long id);
    public List<Customer> findAllByHQL();
    public List<Customer> findAllByQBC();
}
