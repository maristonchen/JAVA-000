package com.mariston.weekfour.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020/11/17 23:16
 */
public abstract class JdbcFactory {

    public static Connection connect(String username, String password, String url, String driverClass) throws Exception {
        //1.加载驱动
        Class.forName(driverClass);
        //2.创建数据库连接
        return DriverManager.getConnection(url, username, password);
    }
}
