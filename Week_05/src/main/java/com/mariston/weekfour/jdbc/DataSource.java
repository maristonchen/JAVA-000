package com.mariston.weekfour.jdbc;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020/11/18 1:03
 */
public abstract class DataSource {
    private static HikariConfig config = new HikariConfig("datasource.properties");
    private static HikariDataSource ds;

    static {
//        config.setJdbcUrl( "jdbc_url" );
//        config.setUsername( "database_username" );
//        config.setPassword( "database_password" );
        config.addDataSourceProperty( "cachePrepStmts" , "true" );
        config.addDataSourceProperty( "prepStmtCacheSize" , "250" );
        config.addDataSourceProperty( "prepStmtCacheSqlLimit" , "2048" );
        ds = new HikariDataSource( config );
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

}
