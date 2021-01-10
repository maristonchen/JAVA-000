package com.mariston.six.service.impl;

import com.mariston.six.dao.CustomerDao;
import com.mariston.six.entity.Customer;
import com.mariston.six.service.CustomerService;
import org.springframework.stereotype.Service;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2021/1/10 14:59
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;

    public CustomerServiceImpl(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public boolean save(Customer customer) {
        return customerDao.insert(customer);
    }

    @Override
    public Customer queryById(Long customerId) {
        return customerDao.selectById(customerId);
    }

    @Override
    public boolean removeById(Long customerId) {
        return false;
    }
}
