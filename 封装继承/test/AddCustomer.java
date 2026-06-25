package test;

import java.util.Scanner;

class AddCustomer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("MyShopping管理系统 > 客户信息管理 > 添加客户信息");
        System.out.println();

        // for循环结构 - 循环录入3位会员的信息
        for (int i = 1; i <= 3; i++) {
            System.out.print("请输入会员号（<4位整数>）：");
            int id = input.nextInt();

            // 使用continue语句：会员号不合法，显示录入失败，跳过本次录入
            if (id < 1000 || id > 9999) {
                System.out.println("会员号不合法，录入失败！");
                System.out.println();
                continue;  // 跳过本次循环，继续下一个会员录入
            }

            System.out.print("请输入会员生日（月/日<用两位整数表示>）：");
            String birthday = input.next();

            System.out.print("请输入会员积分：");
            int points = input.nextInt();

            System.out.println("您录入的会员信息是：");
            System.out.println(id + " " + birthday + " " + points);
            System.out.println();
        }

        System.out.println("程序结束！");
        input.close();
    }
}
