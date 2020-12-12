package exception;

/**
 * @author ：Sunrx26@163.com OwerSun
 * @version : 1.0
 * @program : flashsearch
 * @date ：Created in 2020/6/15 20:02
 * @description ：基本异常类
 * @modified By ：
 */
public class SystemBaseException extends RuntimeException {
    
    public SystemBaseException(String message) {
        super(message);
    }

    public SystemBaseException(String message, Throwable cause) {
        super(message, cause);
    }
}
