package test;

import java.util.Scanner;

class ContinueDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("输入班级总人数：");
        int total = input.nextInt();

        int above80 = 0;  // 80分以上的学生人数

        for (int i = 1; i <= total; i++) {
            System.out.print("请输入第" + i + "位学生的成绩：");
            int score = input.nextInt();

            // 判断：如果成绩<80，不执行num++，直接进入下一次循环
            if (score < 80) {
                continue;  // 使用continue跳过本次循环
            }
            above80++;
        }

        double rate = (double) above80 / total * 100;
        System.out.println("80分以上的学生人数是：" + above80);
        System.out.println("80分以上的学生所占的比例为：" + rate + "%");

        input.close();
    }
}
