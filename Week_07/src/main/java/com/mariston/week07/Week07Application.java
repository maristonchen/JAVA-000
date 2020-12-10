package com.mariston.week07;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@MapperScan("com.mariston.week07.mapper")
@EnableOpenApi
public class Week07Application {

    public static void main(String[] args) {
        SpringApplication.run(Week07Application.class, args);
    }

}
