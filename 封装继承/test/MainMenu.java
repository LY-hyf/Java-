package test;

import java.util.Scanner;

class MainMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("欢迎使用MyShopping管理系统");
        System.out.println("*******************************");
        System.out.println("1. 客户信息管理");
        System.out.println("2. 购物结算");
        System.out.println("3. 真情回馈");
        System.out.println("4. 注销");
        System.out.println("*******************************");

        int choice;

        // 使用do-while循环，直到输入正确
        do {
            System.out.print("请选择，输入数字：");
            choice = input.nextInt();

            if (choice < 1 || choice > 4) {
                System.out.print("输入错误，请重新输入数字：");
                choice = input.nextInt();
            }

        } while (choice < 1 || choice > 4);

        // 执行相应操作
        switch (choice) {
            case 1:
                System.out.println("执行客户信息管理");
                break;
            case 2:
                System.out.println("执行购物结算");
                break;
            case 3:
                System.out.println("执行真情回馈");
                break;
            case 4:
                System.out.println("执行注销");
                break;
        }

        System.out.println("程序结束");
        input.close();
    }
}
