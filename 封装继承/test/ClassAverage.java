package test;

import java.util.Scanner;

class ClassAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        while (true) {
            System.out.print("请输入第" + (count + 1) + "位学生的成绩（输入负数结束）：");
            double score = sc.nextDouble();
            if (score < 0) {
                break;
            }
            sum += score;
            count++;
        }
        if (count > 0) {
            System.out.println("班级平均分：" + (sum / count));
        } else {
            System.out.println("没有输入成绩！");
        }
        sc.close();
    }
}