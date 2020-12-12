package dto;

/**
 * @author ：Sunrx26@163.com OwerSun
 * @version : 1.0
 * @program : flashsearch
 * @date ：Created in 2020/6/11 22:59
 * @description ：Json返回类
 * @modified By ：
 */

public class CommonResult<T> {

    /**
     * 状态 200成功，以外不成功
     */
    private int status;

    /**
     * 信息
     */
    private String message;

    /**
     * 返回值（Json）
     */

    private T resultData;

    /**
     * Gets the value of status.
     *
     * @return the value of status
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the status.
     *
     * <p>You can use getStatus() to get the value of status</p>
     *
     * @param status status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * Gets the value of message.
     *
     * @return the value of message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the message.
     *
     * <p>You can use getMessage() to get the value of message</p>
     *
     * @param message message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets the value of resultData.
     *
     * @return the value of resultData
     */
    public T getResultData() {
        return resultData;
    }

    /**
     * Sets the resultData.
     *
     * <p>You can use getResultData() to get the value of resultData</p>
     *
     * @param resultData resultData
     */
    public void setResultData(T resultData) {
        this.resultData = resultData;
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", resultData=" + resultData +
                '}';
    }

    /**
     * 成功
     *
     * @param status
     * @param message
     * @param resultData
     */
    public CommonResult(int status, String message, T resultData) {
        this.status = status;
        this.message = message;
        this.resultData = resultData;
    }

    /**
     * 不成功
     *
     * @param status
     * @param message
     */
    public CommonResult(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
