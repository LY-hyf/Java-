package encapsulation;

import java.util.Scanner;

/**
 * 菜单类,用于显示菜单和获取用户输入
 * @author hyf
 * @date 2025/5/30
 */
public class Menu {
    Scanner sc = new Scanner(System.in);

    // 显示登录菜单
    public void showLoginMenu() {
        System.out.println("欢迎使用我行我素购物管理系统");
        System.out.println("1. 登录系统");
        System.out.println("2. 退出");
        System.out.print("请选择，输入数字：");
    }

    // 显示主菜单
    public void showMainMenu() {
        System.out.println("\n我行我素购物管理系统主菜单");
        System.out.println("1. 客户信息管理");
        System.out.println("2. 商品管理");
        System.out.print("请选择，输入数字或按0返回上一级菜单：");
    }

    // 显示客户信息管理菜单
    public void showCustMenu() {
        System.out.println("\n我行我素购物管理系统 > 客户信息管理");
        System.out.println("1. 幸运大放送");
        System.out.println("2. 幸运抽奖");
        System.out.println("3. 生日问候");
        System.out.print("请选择，输入数字或按0返回上一级菜单：");
    }

    // 显示商品管理菜单
    public void showGoodsMenu() {
        System.out.println("\n我行我素购物管理系统 > 商品管理");
        System.out.println("1. 幸运大放送");
        System.out.println("2. 幸运抽奖");
        System.out.println("3. 生日问候");
        System.out.print("请选择，输入数字或按0返回上一级菜单：");
    }
}