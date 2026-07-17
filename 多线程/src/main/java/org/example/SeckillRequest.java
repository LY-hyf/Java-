package org.example;

import java.time.LocalDateTime; /**
 * 秒杀请求类
 */
public class SeckillRequest {
    private final String userId;
    private final String productId;
    private final LocalDateTime seckillTime;
    public SeckillRequest(String userId, String productId, LocalDateTime seckillTime) {
        this.userId = userId;
        this.productId = productId;
        this.seckillTime = seckillTime;
    }
    public String getUserId() {
        return userId;
    }
    public String getProductId() {
        return productId;
    }
    public LocalDateTime getSeckillTime() {
        return seckillTime;
    }
}
