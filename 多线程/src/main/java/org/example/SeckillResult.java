package org.example;

/**
 * 秒杀结果类
 */
public class SeckillResult {
    private final boolean success;
    private final String message;
    private final String orderId;

    public SeckillResult(boolean success, String message, String orderId) {
        this.success = success;
        this.message = message;
        this.orderId = orderId;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public String getOrderId() {
        return orderId;
    }

    @Override
    public String toString() {
        return "SeckillResult{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", orderId='" + orderId + '\'' +
                '}';
    }
}
