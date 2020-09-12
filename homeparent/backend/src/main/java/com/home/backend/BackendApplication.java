package com.home.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

// EnableDiscoveryClient适用于多种注册中心
// EnableEurekaClient只适用于eureka
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(basePackages = "com.home.backend.dao")
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

}
