package com.mariston.weekfive.config;

import com.mariston.weekfive.jdbc.MyDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2020/11/19 0:28
 */
@Configuration
public class DataSourceConfig {


    /**
     * 注解装配
     *
     * @return my data source
     */
    @Bean
    public MyDataSource dataSource() {
        return new MyDataSource();
    }

}
