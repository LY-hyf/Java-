package org.example;

/**
 * 月账单类
 * @author hyf
 * @date 2026/6/4
 */
public class MonthlyBill {
    int month;
    double consumption;  // 月消费额
    double balance;       // 余额
    int usedMinutes;      // 使用分钟数
    int remainingMinutes; // 剩余分钟数
    double usedFlow;      // 使用流量(GB)
    double remainingFlow; // 剩余流量(GB)

    // 经典属性与存储属性集合的联动
    public MonthlyBill(int month, double consumption, double balance,
                       int usedMinutes, int remainingMinutes,
                       double usedFlow, double remainingFlow) {
        this.month = month;
        this.consumption = consumption;
        this.balance = balance;
        this.usedMinutes = usedMinutes;
        this.remainingMinutes = remainingMinutes;
        this.usedFlow = usedFlow;
        this.remainingFlow = remainingFlow;
    }

    // 这个方法是重点！虽然代码中没有显式调用，但Java会自动调用
    @Override
    public String toString() {
        return String.format("%2d月 | 话费: %.2f | 余额: %.2f | 通话: %d分钟 | 剩余通话: %d | 流量: %.1fGB | 剩余流量: %.1fGB",
                month, consumption, balance, usedMinutes, remainingMinutes, usedFlow, remainingFlow);
    }
}
