package com.work.payment.dao;

import entity.PayLogModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @author ：Sunrx26@163.com OwerSun
 * @version : 1.0
 * @program : flashsearch
 * @date ：Created in 2020/6/11 22:58
 * @description ：订单Dao
 * @modified By ：
 */
@Mapper
@Component(value = "PaymentDao")
public interface PaymentDao {

    /**
     * 获取支付流水
     *
     * @param logId 自增流水号
     * @return
     */
    PayLogModel getPaymentLog(long logId);

    /**
     * 按照付款用户ID获取支付流水（按时间限制）
     *
     * @param userId    付款用户Id
     * @param startTime 订单创建的时间（左区间）
     * @param endTime   订单创建的时间（右区间）
     * @return 订单记录集合
     */
    List<PayLogModel> getAllPaymentLogsQueryUserId(long userId, Date startTime, Date endTime);

    /**
     * 获取这个付款用户的订单数
     *
     * @param userId    付款用户Id
     * @param startTime 订单创建的时间（左区间）
     * @param endTime   订单创建的时间（右区间）
     * @return 订单数
     */
    int getPaymentLogsQueryUserId(long userId, Date startTime, Date endTime);

    /**
     * 插入支付流水信息
     *
     * @param payLogModel 订单支付流水实体
     * @return
     */
    int insertPaymentLogs(PayLogModel payLogModel);

    /**
     *
     * @return
     */
    int selectRow();
}
