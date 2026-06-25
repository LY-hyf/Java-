package test;

import java.util.Scanner;

class AgeRate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int under30 = 0;  // 30岁以下人数
        int total = 10;    // 总顾客数

        // for循环结构
        for (int i = 1; i <= total; i++) {
            System.out.print("请输入第" + i + "位顾客的年龄：");
            int age = input.nextInt();
            if (age < 30) {
                under30++;
            }
        }

        double under30Rate = (double) under30 / total * 100;
        double above30Rate = 100 - under30Rate;

        System.out.println("30岁以下的比例如：" + under30Rate + "%");
        System.out.println("30岁以上的比例如：" + above30Rate + "%");

        input.close();
    }
}