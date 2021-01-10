package com.mariston.week07;

import com.mariston.week07.config.DynamicDataSourceConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author mariston
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.mariston.week07.mapper")
@EnableOpenApi
@Import({DynamicDataSourceConfig.class})
public class Week07Application {

    public static void main(String[] args) {
        SpringApplication.run(Week07Application.class, args);
    }

}
