package com.mariston.weekfive.jdbc;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.mariston.weekfive.bean.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.*;
import java.util.List;

public class JdbcFactoryTest {

    private Connection connection;

    @Before
    public void getConnection() throws Exception{
        String driverClass = "com.mysql.cj.jdbc.Driver";
        String username = "root";
        String password = "Qazwsx19861125";
        String url = "jdbc:mysql://localhost:3306/account?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf-8&useSSL=false";

        Connection connection = JdbcFactory.connect(username, password, url, driverClass);
        connection.setAutoCommit(false);
        this.connection = connection;
    }

    @After
    public void closeConnection() {
        try {
            this.connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void insert() {

        try {
            String insertSql = "insert into t_user (name,age) value (?,?)";

            PreparedStatement statement = connection.prepareStatement(insertSql);
            statement.setString(1, "张三2");
            statement.setInt(2, 10);
            boolean success = statement.execute();
            System.out.println(success);
            connection.commit();

            statement.closeOnCompletion();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void update() {
        try {
            String updateSql = "update t_user set name=? where id =?";

            PreparedStatement statement = connection.prepareStatement(updateSql);
            statement.setString(1, "zs");
            statement.setInt(2, 1);
            boolean success = statement.execute();
            System.out.println(success);
            connection.commit();
            statement.closeOnCompletion();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void select() {
        try {
            String querySql = "select id, name,age from t_user";

            PreparedStatement statement = connection.prepareStatement(querySql, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.executeQuery();

            List<User> userList = Lists.newArrayList();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int age = resultSet.getInt(3);
                User user = User.builder().id(id).name(name).age(age).build();
                userList.add(user);
            }

            Gson gson = new Gson();

            System.out.println(gson.toJson(userList));

            resultSet.close();


            statement.closeOnCompletion();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void delete() {
        try {
            String updateSql = "delete from `t_user` where `id` =?";

            PreparedStatement statement = connection.prepareStatement(updateSql);
            statement.setInt(1, 4);
            int num = statement.executeUpdate();
            System.out.println(num);
            connection.commit();
            statement.closeOnCompletion();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
