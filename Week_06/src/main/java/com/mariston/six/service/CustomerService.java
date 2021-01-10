package com.mariston.six.service;

import com.mariston.six.entity.Customer;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2021/1/10 14:56
 */
public interface CustomerService {

    boolean save(Customer customer);

    Customer queryById(Long customerId);

    boolean removeById(Long customerId);
}
