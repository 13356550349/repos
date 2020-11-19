package com.itheima.ssh.dao.impl;

import com.itheima.ssh.dao.CustomerDao;
import com.itheima.ssh.domain.Customer;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {
    @Override
    public void save(Customer customer) {
        this.getHibernateTemplate().save(customer);
    }

    @Override
    public void update(Customer customer) {
        this.getHibernateTemplate().update(customer);

    }

    @Override
    public void delete(Customer customer) {
        this.getHibernateTemplate().delete(customer);

    }

    @Override
    public Customer findById(Long id) {
        return this.getHibernateTemplate().get(Customer.class,id);
    }

    @Override
    public List<Customer> findAllByHQL() {
        List<Customer> list=(List<Customer>) this.getHibernateTemplate().find("from Customer");
        return list;
    }

    @Override
    public List<Customer> findAllByQBC() {
        DetachedCriteria criteria = DetachedCriteria.forClass(Customer.class);
        List<Customer> list =(List<Customer>)  this.getHibernateTemplate().findByCriteria(criteria);
        return list;
    }

}
