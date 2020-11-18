package com.mariston.weekfive.service;

import com.mariston.weekfive.bean.User;

import java.util.List;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020/11/19 0:07
 */
public interface UserService {

    /**
     * save user
     *
     * @param user user
     * @return num
     */
    int save(User user);

    /**
     * query all data of user
     * @return list
     */
    List<User> queryAll();

}
