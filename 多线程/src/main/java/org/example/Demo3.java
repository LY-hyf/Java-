package org.example;

/**
 * 多线程程序：两个线程分别打印 1~50 的奇数和偶数
 * 使用实现 Runnable 接口的方式创建线程
 */
public class Demo3 {
    public static void main(String[] args) {
        Runnable oddTask = new OddPrinter();
        Runnable evenTask = new EvenPrinter();
        Thread oddThread = new Thread(oddTask, "奇数线程");
        Thread evenThread = new Thread(evenTask, "偶数线程");
        oddThread.start();
        evenThread.start();
    }
}

