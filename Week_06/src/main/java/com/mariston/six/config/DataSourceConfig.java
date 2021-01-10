package com.mariston.six.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2021/1/10 12:26
 */
@Configuration
public class DataSourceConfig {

    @Bean(name = "mainDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.db1")
    public DataSource mainDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean(name = "secondDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.db2")
    public DataSource secondDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean(name = "thirdDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.db3")
    public DataSource thirdDataSource() {
        return DataSourceBuilder.create().build();
    }

}
