package com.mariston.weekfive.service.impl;

import com.mariston.weekfive.bean.Dept;
import com.mariston.weekfive.dao.DeptDao;
import com.mariston.weekfive.dao.UserDao;
import com.mariston.weekfive.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020/11/19 0:22
 */
@Service
public class DeptServiceImpl implements DeptService {

    /**
     * 注解注入
     */
    @Resource
    private DeptDao deptDao;

    @Autowired
    private UserDao userDao;

    /**
     * query all department
     *
     * @return list
     */
    @Override
    public List<Dept> queryAll() {
        return null;
    }
}
