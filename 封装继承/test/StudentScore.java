package test;

import java.util.Scanner;

class StudentScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("输入学生姓名：");
        String name = input.next();

        int sum = 0;  // 总成绩
        int courseCount = 5;  // 5门功课

        // 使用for循环输入5门课成绩
        for (int i = 1; i <= courseCount; i++) {
            System.out.print("请输入5门功课中第" + i + "门课的成绩：");
            int score = input.nextInt();
            sum += score;
        }

        double average = (double) sum / courseCount;
        System.out.println(name + "的平均分是：" + average);

        input.close();
    }
}
