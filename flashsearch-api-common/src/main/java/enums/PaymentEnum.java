package enums;

/**
 * @author ：Sunrx26@163.com OwerSun
 * @version : 1.0
 * @program : flashsearch
 * @date ：Created in 2020/6/15 20:16
 * @description ：支付服务 数字字典
 * @modified By ：
 */
public enum PaymentEnum {

    /**
     * 支付成功
     */
    SUCCESS(1, "支付成功"),

    /**
     * 支付失败
     */
    FAILE(0, "支付失败");
    
    /**
     * 状态表示
     */
    private int state;

    /**
     * 状态信息
     */
    private String stateInfo;

    private PaymentEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public static PaymentEnum stateOf(int index) {
        for (PaymentEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }
}
