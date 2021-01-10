package com.mariston.six.dao;

import com.mariston.six.entity.Customer;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2021/1/10 15:01
 */
public interface CustomerDao {

    boolean insert(Customer customer);

    Customer selectById(Long customerId);

    boolean deleteById(Long customerId);
}
