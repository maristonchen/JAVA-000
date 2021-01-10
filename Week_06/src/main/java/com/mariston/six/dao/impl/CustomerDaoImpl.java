package com.mariston.six.dao.impl;

import com.mariston.six.dao.CustomerDao;
import com.mariston.six.entity.Customer;
import com.mariston.six.uitl.JdbcUtils;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2021/1/10 15:02
 */
@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao {

    private final DataSource mainDataSource;

    private final DataSource secondDataSource;

    public CustomerDaoImpl(@Qualifier("mainDataSource") DataSource mainDataSource,
                           @Qualifier("secondDataSource") DataSource secondDataSource) {
        this.mainDataSource = mainDataSource;
        this.secondDataSource = secondDataSource;
    }

    @Override
    public boolean insert(Customer customer) {
        try {
            Connection connection = mainDataSource.getConnection();
            connection.setAutoCommit(false);
            String sql = "insert into t_customer(t_customer.name, t_customer.age, t_customer.create_time)value (?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, customer.getName());
            ps.setInt(2, customer.getAge());
            ps.setTimestamp(3, Timestamp.from(LocalDateTime.now().toInstant(ZoneOffset.of("+8"))));
            ps.execute();

            ps.closeOnCompletion();
            connection.commit();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public Customer selectById(Long customerId) {
        try {
            Connection connection = secondDataSource.getConnection();
            String sql = "select customer_id,name,age,create_time from t_customer where customer_id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setLong(1, customerId);
            ResultSet resultSet = ps.executeQuery();
            return JdbcUtils.fillValues(resultSet, Customer.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean deleteById(Long customerId) {
        try {
            Connection connection = mainDataSource.getConnection();
            connection.setAutoCommit(false);
            String sql = "delete from t_customer where customer_id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
