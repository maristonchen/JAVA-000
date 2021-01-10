package com.mariston.six.controller;

import com.mariston.six.entity.Customer;
import com.mariston.six.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2021/1/10 14:09
 */
@RequestMapping("customer")
@RestController
public class CustomerController {

    @Resource
    private CustomerService customerService;

    /**
     * 保存客户信息
     *
     * @param customer customer
     * @return boolean
     */
    @PostMapping("save")
    public boolean save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping("queryById")
    public Customer queryById(Long id) {
        return customerService.queryById(id);
    }
}
