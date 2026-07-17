package org.example;

/**
 * 模拟死锁场景
 *
 * 死锁产生的四个必要条件（缺一不可）：
 * 1. 互斥条件：资源每次只能被一个线程使用
 * 2. 请求与保持条件：线程已持有资源，又请求其他被占用的资源
 * 3. 不可剥夺条件：资源只能由持有者主动释放
 * 4. 循环等待条件：多个线程形成环形等待链
 *
 * 预防死锁的方法：
 * 1. 破坏"循环等待"：对锁进行统一编号，要求线程按固定顺序获取锁。
 *    例如本例中，强制所有线程先获取lockA再获取lockB，就不会死锁。
 * 2. 破坏"请求与保持"：使用 tryLock 设置超时，获取不到就释放已有锁。
 * 3. 破坏"不可剥夺"：使用 Lock 接口的 lockInterruptibly()，支持中断。
 * 4. 使用"锁排序"：保证所有线程以相同的全局顺序获取锁。
 */
public class Demo2 {
    private static final Object lockA = new Object();
    private static final Object lockB = new Object();
    public static void main(String[] args) {
        System.out.println("死锁场景模拟");
        System.out.println("主线程启动两个子线程，观察是否会死锁\n");
        // 线程1：持有 lockA，尝试获取 lockB
        Thread thread1 = new Thread(() -> {
            synchronized (lockA) {
                System.out.println("线程1：持有 lockA，尝试获取 lockB...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                synchronized (lockB) {
                    System.out.println("线程1：成功获取 lockB");
                }
            }
        }, "线程1");
        // 传统方法匿名内部类实现Runnable接口
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                synchronized (lockA) {
//                    System.out.println("线程1：持有 lockA，尝试获取 lockB...");
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        Thread.currentThread().interrupt();
//                    }
//                    synchronized (lockB) {
//                        System.out.println("线程1：成功获取 lockB");
//                    }
//                }
//            }
//        }, "线程1");
        // 线程2：持有 lockB，尝试获取 lockA
        Thread thread2 = new Thread(() -> {
            synchronized (lockB) {
                System.out.println("线程2：持有 lockB，尝试获取 lockA...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                synchronized (lockA) {
                    System.out.println("线程2：成功获取 lockA");
                }
            }
        }, "线程2");
        thread1.start();
        thread2.start();
        // 等待线程结束（会因死锁而永远等下去）
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("程序结束");
    }
}
