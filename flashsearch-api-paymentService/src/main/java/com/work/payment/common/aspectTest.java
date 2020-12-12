package com.work.payment.common;

import ch.qos.logback.core.CoreConstants;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author ：Sunrx26@163.com OwerSun
 * @version :
 * @program : flashsearch
 * @date ：Created in 2020/7/7 0:26
 * @description ：
 * @modified By ：
 */
@Aspect
@Component
public class aspectTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* com.work.payment.controller.PaymentController.index())")
    public void haha() {
        logger.info("Aspect Test");
        return;
    }

}
