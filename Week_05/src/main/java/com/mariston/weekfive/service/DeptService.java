package com.mariston.weekfive.service;

import com.mariston.weekfive.bean.Dept;

import java.util.List;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020/11/19 0:20
 */
public interface DeptService {

    /**
     * query all department
     *
     * @return list
     */
    List<Dept> queryAll();
}
