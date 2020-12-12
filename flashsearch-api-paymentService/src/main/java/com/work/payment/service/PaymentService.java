package com.work.payment.service;

import dto.CommonResult;
import entity.PayLogModel;

import java.util.Date;
import java.util.List;

/**
 * @author ：Sunrx26@163.com OwerSun
 * @version : 1.0
 * @program : flashsearch
 * @date ：Created in 2020/6/15 19:53
 * @description ：支付服务接口
 * @modified By ：
 */
public interface PaymentService {

    /**
     * 获取支付流水
     *
     * @param logId 自增流水号
     * @return
     */
    CommonResult getPaymentLog(long logId);

    /**
     * 按照付款用户ID获取支付流水（按时间限制）
     *
     * @param userId    付款用户Id
     * @param startTime 订单创建的时间（左区间）
     * @param endTime   订单创建的时间（右区间）
     * @return 订单记录集合
     */
    CommonResult getAllPaymentLogsQueryUserId(long userId, Date startTime, Date endTime);

    /**
     * 获取这个付款用户的订单数
     *
     * @param userId    付款用户Id
     * @param startTime 订单创建的时间（左区间）
     * @param endTime   订单创建的时间（右区间）
     * @return 订单数
     */
    CommonResult getPaymentLogsQueryUserId(long userId, Date startTime, Date endTime);
}
