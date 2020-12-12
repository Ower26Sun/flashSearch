package com.work.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：Sunrx26@163.com OwerSun
 * @version : 1.0
 * @program : flashsearch
 * @date ：Created in 2020/7/4 21:54
 * @description ：EurekaServer
 * @modified By ：
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
