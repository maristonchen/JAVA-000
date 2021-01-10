package com.mariston.six;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author mariston
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Week06Application {

    public static void main(String[] args) {
        SpringApplication.run(Week06Application.class, args);
    }

}
