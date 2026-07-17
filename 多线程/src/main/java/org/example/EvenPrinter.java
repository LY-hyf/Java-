package org.example;

/**
 * 打印偶数的任务
 */
public class EvenPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "：" + i);
            }
        }
    }
}
