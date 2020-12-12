package com.work.payment.controller;

import com.work.payment.service.PaymentService;
import dto.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * @author ：Sunrx26@163.com OwerSun
 * @version : 1.0
 * @program : flashsearch
 * @date ：Created in 2020/6/15 19:43
 * @description ：支付服务控制层
 * @modified By ：
 */
@RestController
@RequestMapping(value = "/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @ResponseBody
    @RequestMapping(value = "/index", produces = "application/json;charset=UTF-8")
    public CommonResult index() {
        String beginTime = "0001-01-01 00:00:00";
        String endTime = "9999-12-31 00:00:00";

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");//对日期进行格式化

        Date max = new Date(Long.MAX_VALUE);
        Date min = new Date(Long.MIN_VALUE);

        System.out.println(df.format(new Date()));
        CommonResult result = paymentService.getPaymentLog(1000);
        if (result == null) {
            result.setResultData("没有数据");
        }
        return result;
    }

}
