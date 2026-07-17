package org.example;

import java.time.LocalDateTime;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 完整的秒杀系统模拟
 * 包含：商品库存管理、高并发处理（线程池）、线程安全控制（锁）、秒杀结果返回
 */
public class Demo4 {
    public static void main(String[] args) {
        System.out.println("秒杀系统模拟\n");
        // 初始化商品（只有10件）
        Product product = new Product("P001", "iPhone 16 Pro Max", 10);
        System.out.println("商品信息：" + product);
        System.out.println();
        // 创建秒杀服务
        SeckillService seckillService = new SeckillService();
        // 使用线程池模拟高并发（核心线程 20，最大 50，队列 200）
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                20,
                50,
                60,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(200),
                // 用 CallerRunsPolicy 替代 AbortPolicy，让提交线程自行执行被拒绝的任务，实现自然限流
                new ThreadPoolExecutor.CallerRunsPolicy()
        );
        int totalUsers = 1000;
        // 记录秒杀结果
        ConcurrentHashMap<String, SeckillResult> results = new ConcurrentHashMap<>();
        // 计数器：记录成功和失败数量
        AtomicInteger successCount = new AtomicInteger(0);
        AtomicInteger failCount = new AtomicInteger(0);
        long startTime = System.currentTimeMillis();
        // 提交 1000 个用户秒杀请求
        for (int i = 1; i <= totalUsers; i++) {
            String userId = "User" + String.format("%04d", i);
            SeckillRequest request = new SeckillRequest(userId, product.getProductId(), LocalDateTime.now());
            executor.submit(() -> {
                SeckillResult result = seckillService.processSeckill(product, request);
                results.put(request.getUserId(), result);
                if (result.isSuccess()) {
                    successCount.incrementAndGet();
                } else {
                    failCount.incrementAndGet();
                }
            });
        }
        // 关闭线程池
        executor.shutdown();
        try {
            executor.awaitTermination(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        long endTime = System.currentTimeMillis();
        // 输出统计结果
        System.out.println("秒杀结束");
        System.out.println("响应时间：" + (endTime - startTime) + " ms");
        System.out.println("参与用户：" + totalUsers);
        System.out.println("秒杀成功：" + successCount.get());
        System.out.println("秒杀失败：" + failCount.get());
        System.out.println("剩余库存：" + product.getStock());
        System.out.println();
        // 输出前 10 个成功抢购的用户
        System.out.println("--- 秒杀成功的用户（前10名） ---");
        results.values().stream()
                .filter(SeckillResult::isSuccess)
                .limit(10)
                .forEach(System.out::println);
        System.out.println("\n--- 秒杀失败的示例 ---");
        results.values().stream()
                .filter(r -> !r.isSuccess())
                .limit(5)
                .forEach(System.out::println);
    }
}

