package com.work.payment.dao;


import entity.PayLogModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class PaymentDaoTest {

    public volatile int dataRow = 0;

    public int count = 0;

    class runnableTest implements Runnable {

        public PayLogModel payLogModel;


        public runnableTest(PayLogModel payLogModel) {
            this.payLogModel = payLogModel;
        }

        @Override
        public void run() {

            paymentDao.insertPaymentLogs(payLogModel);
        }
    }

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public PaymentDao paymentDao;

    @Test
    public void getPaymentLog() {

        PayLogModel result = new PayLogModel();
        long aaa = 1;
        result = paymentDao.getPaymentLog(aaa);
        logger.info("result={}", result);

    }

    @Test
    public void getAllPaymentLogsQueryUserId() {
    }

    @Test
    public void getPaymentLogsQueryUserId() {
    }

    @Test
    public void selectRow() {
        count = paymentDao.selectRow();
    }

    @Test
    public void insert() {
        final int dataSize = 100000000;//插入数据数量
        final int dataUnit = 1000;//1个线程处理数据数量
        selectRow();
        System.out.println("现在DB里数据的数量是：" + count);
        final int threadNum = dataSize / dataUnit + 1;
        insertDateThread(threadNum);
        selectRow();
        System.out.println("执行后DB里数据的数量是：" + count);
    }

    private void insertDateThread(int threadNum) {
        ExecutorService excutor = Executors.newFixedThreadPool(threadNum); //使用线程池
        final CountDownLatch cdl = new CountDownLatch(threadNum);//使用计数器
        long st = System.currentTimeMillis();

        for (int k = 1; k <= threadNum; k++) {
            excutor.execute(new Thread(new Runnable() {
                @Override
                public void run() {
                    PayLogModel payLogModel = new PayLogModel();
                    payLogModel.setUserId(1000);
                    payLogModel.setOrderId((long) 10000);

                    payLogModel.setStatusFlag(Math.random() > 0.5 ? (byte) -1 : (byte) 0);
                    payLogModel.setCreateTime(new Date());
                    payLogModel.setOrderNumber(String.valueOf(Integer.parseInt(new DecimalFormat("0").format(Math.random() * 1000))));
                    payLogModel.setOrderAmout(new BigDecimal(Math.random() * 1000000));
                    paymentDao.insertPaymentLogs(payLogModel);
                    cdl.countDown();
                }
            }));
        }
        try {
            excutor.shutdown();
            cdl.await();//线程等待
            long ut = System.currentTimeMillis() - st;
            System.out.println(threadNum + "个线程总共耗费时间" + ut / 1000 + "s(" + ut + "ms)");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}