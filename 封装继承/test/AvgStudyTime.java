package test;

import java.util.Scanner;
// 28. 统计平均学习时间
class AvgStudyTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("请输入第" + i + "天的学习时间（小时）：");
            int hours = sc.nextInt();
            total += hours;
        }
        double avg = (double) total / 5;
        System.out.println("平均学习时间：" + avg + "小时");
        sc.close();
    }
}