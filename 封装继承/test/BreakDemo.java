package test;

import java.util.Scanner;

class BreakDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("输入学生姓名：");
        String name = input.next();

        int sum = 0;
        boolean hasError = false;

        // 循环录入成绩，判断录入正确性
        for (int i = 1; i <= 5; i++) {
            System.out.print("请输入第" + i + "门课的成绩：");
            int score = input.nextInt();

            if (score < 0) {
                System.out.println("抱歉，分数录入错误，请重新进行录入！");
                hasError = true;
                break;  // 使用break语句立刻跳出循环
            }

            sum += score;  // 否则，累加求和
        }

        if (!hasError) {
            double average = (double) sum / 5;
            System.out.println(name + "的平均分是：" + average);
        }

        input.close();
    }
}
