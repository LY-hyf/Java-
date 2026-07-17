package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 秒杀服务核心类
 */
public class SeckillService {
    private final ReentrantLock lock = new ReentrantLock();
    private final AtomicInteger orderIdCounter = new AtomicInteger(0);
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    /**
     * 处理秒杀请求（使用 ReentrantLock 保证线程安全）
     *
     * @param product 秒杀商品
     * @param request 秒杀请求
     * @return 秒杀结果
     */
    public SeckillResult processSeckill(Product product, SeckillRequest request) {
        // 加锁，确保同一时间只有一个线程操作库存
        lock.lock();
        try {
            // 1. 检查库存是否充足
            if (product.getStock() <= 0) {
                return new SeckillResult(false, "很遗憾，商品已售罄！", null);
            }
            // 2. 模拟业务处理（扣款、生成订单等）
            String orderId = generateOrderId(request.getUserId());
            // 模拟业务耗时（如数据库写入）
            Thread.sleep(2);
            // 3. 减少库存
            product.decreaseStock();
            return new SeckillResult(true, "恭喜您，抢购成功！", orderId);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return new SeckillResult(false, "系统异常，请重试！", null);
        } finally {
            // 确保锁一定会释放
            lock.unlock();
        }
    }
    /**
     * 生成订单ID
     */
    private String generateOrderId(String userId) {
        String now = LocalDateTime.now().format(FORMATTER);
        return "ORD-" + now + "-" + String.format("%04d", orderIdCounter.incrementAndGet());
    }
}
