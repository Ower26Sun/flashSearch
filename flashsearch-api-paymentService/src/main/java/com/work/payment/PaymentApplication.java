package com.work.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author ：Sunrx26@163.com OwerSun
 * @version : 1.0
 * @program : flashsearch
 * @date ：Created in 2020/6/11 22:48
 * @description ：支付模块主启动类
 * @modified By ：
 */
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class PaymentApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class, args);
    }
}
