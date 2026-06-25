package test;

import java.util.Scanner;

class AddUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("青岛迷你游戏平台 > 添加用户信息");
        System.out.print("请输入要录入用户的数量：");
        int count = input.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println();
            System.out.print("请输入用户编号（<4位整数>）：");
            int id = input.nextInt();

            System.out.print("请输入用户年龄：");
            int age = input.nextInt();

            // 要求年龄10岁以上
            if (age <= 10) {
                System.out.println("很抱歉，您的年龄不适宜玩游戏");
                System.out.println("录入信息失败");
                continue;  // 跳过本次录入，继续下一个用户
            }

            System.out.print("请输入会员积分：");
            int points = input.nextInt();

            System.out.println("您录入的会员信息是：");
            System.out.println("用户编号：" + id);
            System.out.println("年龄：" + age);
            System.out.println("积分：" + points);
        }

        input.close();
    }
}