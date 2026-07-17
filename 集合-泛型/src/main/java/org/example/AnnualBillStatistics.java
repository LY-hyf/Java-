package org.example;

import java.util.*;

/**
 * 模拟12个月的手机话费数据，统计年度话费、流量、通话分钟数
 * @author hyf
 * @date 2026/6/4
 */
public class AnnualBillStatistics {
    public static void main(String[] args) {
        // 创建Map：键是月份（Integer），值是MonthlyBill对象
        Map<Integer, MonthlyBill> bills = new HashMap<>();

        // 模拟12个月的话费数据
        double totalConsumption = 0;
        int totalMinutes = 0;
        double totalFlow = 0;

        // 添加1-12月的数据
        for (int i = 1; i <= 12; i++) {
            double consumption = 50 + Math.random() * 50;  // 50-100元
            double balance = 100 - consumption;
            int minutes = 100 + (int)(Math.random() * 200);  // 100-300分钟
            int remainingMinutes = 500 - minutes;
            double flow = 2 + Math.random() * 8;  // 2-10GB
            double remainingFlow = 20 - flow;
            // 创建MonthlyBill对象，调用构造方法联动
            MonthlyBill bill = new MonthlyBill(i, consumption, balance,
                    minutes, remainingMinutes,
                    flow, remainingFlow);
            // 键是月份i，值是bill对象
            bills.put(i, bill);

            totalConsumption += consumption;
            totalMinutes += minutes;
            totalFlow += flow;
        }

        // 输出年度汇总
        System.out.println("=== 年度汇总 ===");
        System.out.printf("年度总话费额: %.2f元\n", totalConsumption);
        System.out.printf("年度总流量额: %.2fGB\n", totalFlow);
        System.out.printf("年度总分钟数: %d分钟\n", totalMinutes);

        // 输出每月详情
        System.out.println("\n=== 每月详情 ===");
        for (int i = 1; i <= 12; i++) {
            // 当打印一个对象时，Java会自动调用该对象的toString()方法
            // 相当于：System.out.println(bills.get(i).toString());
            // 不重写toString()方法，打印的是对象的内存地址,输出类似 MonthlyBill@15db9742 这样的内存地址
            System.out.println(bills.get(i));
            // bills.get(i) 返回的是 MonthlyBill 对象
            // 不是返回Map的键值对！
        }
    }
}
