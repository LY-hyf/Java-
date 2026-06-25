package control.test;

import java.util.Scanner;

public class MenuSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 第一级：登录菜单
        System.out.println("购物管理系统>客户信息管理");
        System.out.println("1. 登录系统");
        System.out.println("2. 退出");
        System.out.print("请选择：");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("\n登录成功！\n");

            // 第二级：主菜单
            System.out.println("1. 客户信息管理");
            System.out.println("2. 购物结算");
            System.out.println("3. 真情回馈");
            System.out.println("4. 注销");
            System.out.print("请选择：");
            int mainChoice = input.nextInt();

            switch (mainChoice) {
                case 1:
                    System.out.println("\n--- 客户信息管理 ---");
                    System.out.println("1. 显示所有客户信息");
                    System.out.println("2. 添加客户信息");
                    System.out.println("3. 修改客户信息");
                    System.out.println("4. 查询客户信息");
                    break;
                case 2:
                    System.out.println("\n--- 购物结算 ---");
                    break;
                case 3:
                    System.out.println("\n--- 真情回馈 ---");
                    System.out.println("1. 幸运大放送");
                    System.out.println("2. 幸运抽奖");
                    System.out.println("3. 生日问候");
                    break;
                case 4:
                    System.out.println("已注销");
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }
        } else {
            System.out.println("感谢使用，再见！");
        }

        input.close();
    }
}
