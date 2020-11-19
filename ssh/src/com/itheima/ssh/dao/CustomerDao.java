package com.itheima.ssh.dao;

import com.itheima.ssh.domain.Customer;

import java.util.List;

public interface CustomerDao {
    public void save(Customer customer);
    public void update(Customer customer);
    public void delete(Customer customer);
    public Customer findById(Long id);
    public List<Customer> findAllByHQL();
    public List<Customer> findAllByQBC();
}
