package com.tsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class BackEndApplication {
    public static void main(String[] args) {
        SpringApplication.run(BackEndApplication.class, args);
    }
}
