package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description:本服务启动后会自动注册进eureka服务中
 * @author: zhenglongsu@163.com
 * @date: 2018.07.20 11:15
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8002_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002_App.class, args);
    }
}
