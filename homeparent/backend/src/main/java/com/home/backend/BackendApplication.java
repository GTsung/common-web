package com.home.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

// EnableDiscoveryClient适用于多种注册中心
// EnableEurekaClient只适用于eureka
@EnableDiscoveryClient
@SpringBootApplication
// 此注解用于开启spring-tx事务，是spring的注解
// 如果采用springboot，可以不加此注解一样会处理事务,因为springboot自动配置TransactionAutoConfiguration
//@EnableTransactionManagement
@MapperScan(basePackages = "com.home.backend.dao")
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

}
