package demo;

import pojo.Score;

/**
 * 表现层：使用Score实体计算平均分
 */
public class Demo1 {
    public static void main(String[] args) {
        Score sc = new Score();
        sc.addScore("Java", 80);
        sc.addScore("SQL", 95);
        sc.addScore("HTML", 77);

        float avg = sc.getAvg();
        System.out.println("平均分：" + avg);
    }
}
