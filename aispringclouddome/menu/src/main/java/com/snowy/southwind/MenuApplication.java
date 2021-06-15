package com.snowy.southwind;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @auther snowy
 * @date 2020/1/18 - 22:16
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.snowy.southwind.dao")
public class MenuApplication {
    public static void main(String[] args) {
        SpringApplication.run(MenuApplication.class,args);
    }
}
