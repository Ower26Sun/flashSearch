package exception;

/**
 * @author ：Sunrx26@163.com OwerSun
 * @version : 1.0
 * @program : flashsearch
 * @date ：Created in 2020/6/20 21:00
 * @description ：支付异常
 * @modified By ：
 */
public class PaymentFailedException extends SystemBaseException {
    public PaymentFailedException(String message) {
        super(message);
    }

    public PaymentFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}
