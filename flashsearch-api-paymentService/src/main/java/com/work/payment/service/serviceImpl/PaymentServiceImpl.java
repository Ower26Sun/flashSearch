package com.work.payment.service.serviceImpl;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.work.payment.dao.PaymentDao;
import com.work.payment.service.PaymentService;
import dto.CommonResult;
import entity.PayLogModel;
import enums.PaymentEnum;
import exception.PaymentFailedException;
import exception.SystemBaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author ：Sunrx26@163.com OwerSun
 * @version : 1.0
 * @program : flashsearch
 * @date ：Created in 2020/6/15 19:55
 * @description ：支付业务 实现类
 * @modified By ：
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public CommonResult getPaymentLog(long logId) {

        PayLogModel payLogModel = new PayLogModel();
        try {

            payLogModel = paymentDao.getPaymentLog(logId);

        } catch (PaymentFailedException ex1) {

        } catch (Exception e) {
            return new CommonResult<String>(PaymentEnum.FAILE.getState(), PaymentEnum.FAILE.getStateInfo());
        }

        return new CommonResult<>(PaymentEnum.SUCCESS.getState(), PaymentEnum.SUCCESS.getStateInfo(), payLogModel);
    }

    @Override
    public CommonResult getAllPaymentLogsQueryUserId(long userId, Date startTime, Date endTime) {
        return null;
    }

    @Override
    public CommonResult getPaymentLogsQueryUserId(long userId, Date startTime, Date endTime) {
        return null;
    }
}
