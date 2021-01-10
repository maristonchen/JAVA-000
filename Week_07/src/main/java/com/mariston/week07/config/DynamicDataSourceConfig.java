package com.mariston.week07.config;

import com.mariston.week07.db.DataSourceNames;
import com.mariston.week07.db.DynamicDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * please describe this java file
 *
 * @author mariston
 * @version 1.0.0
 * @since 2021/1/10 12:26
 */
@Configuration
public class DynamicDataSourceConfig {

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

    @Bean
    @Primary
    public DynamicDataSource dataSource(DataSource mainDataSource, DataSource secondDataSource) {
        Map<Object, Object> targetDataSources = new HashMap<>(5);
        targetDataSources.put(DataSourceNames.MAIN_DATA_SOURCE_NAME, mainDataSource);
        targetDataSources.put(DataSourceNames.SECONDARY_DATA_SOURCE_NAME, secondDataSource);
        return new DynamicDataSource(mainDataSource, targetDataSources);
    }

}
