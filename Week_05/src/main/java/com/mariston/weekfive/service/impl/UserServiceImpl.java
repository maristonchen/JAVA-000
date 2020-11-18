package com.mariston.weekfive.service.impl;

import com.google.common.collect.Lists;
import com.mariston.weekfive.bean.User;
import com.mariston.weekfive.dao.UserDao;
import com.mariston.weekfive.jdbc.DataSource;
import com.mariston.weekfive.service.UserService;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020/11/19 0:09
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    /**
     * 构造器注入
     * @param userDao userDao
     */
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * save user
     *
     * @param user user
     * @return num
     */
    @Override
    public int save(User user) {
        return 0;
    }

    /**
     * query all data of user
     *
     * @return list
     */
    @Override
    public List<User> queryAll() {
        List<User> userList = Lists.newArrayList();
        try {
            Connection connection = DataSource.getConnection();
            String querySql = "select id, name,age from t_user";


            PreparedStatement statement = connection.prepareStatement(querySql, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.executeQuery();


            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int age = resultSet.getInt(3);
                User user = User.builder().id(id).name(name).age(age).build();
                userList.add(user);
            }

            resultSet.close();
            statement.closeOnCompletion();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }
}
