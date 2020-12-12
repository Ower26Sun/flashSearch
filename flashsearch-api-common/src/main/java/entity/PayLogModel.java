package entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ：Sunrx26@163.com OwerSun
 * @version : 1.0
 * @program : flashsearch
 * @date ：Created in 2020/6/11 22:52
 * @description ：订单支付流水实体
 * @modified By ：
 */
public class PayLogModel {

    /**
     * 主键（自增）
     */
    private long logId;

    /**
     * 付款用户Id
     */
    private long userId;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 订单号
     */
    private String orderNumber;

    /**
     * 订单金额
     */
    private BigDecimal orderAmout;

    /**
     * 外部订单号，支付记录号
     */
    private String outerTradeNo;

    /**
     * 支付状态 0：未支付 1：已支付
     */
    private byte statusFlag;

    /**
     * 支付流水创建时间
     */
    private Date createTime;

    /**
     * Gets the value of logId.
     *
     * @return the value of logId
     */
    public long getLogId() {
        return logId;
    }

    /**
     * Sets the logId.
     *
     * <p>You can use getLogId() to get the value of logId</p>
     *
     * @param logId logId
     */
    public void setLogId(long logId) {
        this.logId = logId;
    }

    /**
     * Gets the value of userId.
     *
     * @return the value of userId
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Sets the userId.
     *
     * <p>You can use getUserId() to get the value of userId</p>
     *
     * @param userId userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }

    /**
     * Gets the value of orderId.
     *
     * @return the value of orderId
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * Sets the orderId.
     *
     * <p>You can use getOrderId() to get the value of orderId</p>
     *
     * @param orderId orderId
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * Gets the value of orderNumber.
     *
     * @return the value of orderNumber
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the orderNumber.
     *
     * <p>You can use getOrderNumber() to get the value of orderNumber</p>
     *
     * @param orderNumber orderNumber
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * Gets the value of orderAmout.
     *
     * @return the value of orderAmout
     */
    public BigDecimal getOrderAmout() {
        return orderAmout;
    }

    /**
     * Sets the orderAmout.
     *
     * <p>You can use getOrderAmout() to get the value of orderAmout</p>
     *
     * @param orderAmout orderAmout
     */
    public void setOrderAmout(BigDecimal orderAmout) {
        this.orderAmout = orderAmout;
    }

    /**
     * Gets the value of outerTradeNo.
     *
     * @return the value of outerTradeNo
     */
    public String getOuterTradeNo() {
        return outerTradeNo;
    }

    /**
     * Sets the outerTradeNo.
     *
     * <p>You can use getOuterTradeNo() to get the value of outerTradeNo</p>
     *
     * @param outerTradeNo outerTradeNo
     */
    public void setOuterTradeNo(String outerTradeNo) {
        this.outerTradeNo = outerTradeNo;
    }

    /**
     * Gets the value of statusFlag.
     *
     * @return the value of statusFlag
     */
    public byte getStatusFlag() {
        return statusFlag;
    }

    /**
     * Sets the statusFlag.
     *
     * <p>You can use getStatusFlag() to get the value of statusFlag</p>
     *
     * @param statusFlag statusFlag
     */
    public void setStatusFlag(byte statusFlag) {
        this.statusFlag = statusFlag;
    }

    /**
     * Gets the value of createTime.
     *
     * @return the value of createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * Sets the createTime.
     *
     * <p>You can use getCreateTime() to get the value of createTime</p>
     *
     * @param createTime createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "PayLogModel{" +
                "logId=" + logId +
                ", userId=" + userId +
                ", orderId=" + orderId +
                ", orderNumber='" + orderNumber + '\'' +
                ", orderAmout=" + orderAmout +
                ", outerTradeNo='" + outerTradeNo + '\'' +
                ", statusFlag=" + statusFlag +
                ", createTime=" + createTime +
                '}';
    }
}
