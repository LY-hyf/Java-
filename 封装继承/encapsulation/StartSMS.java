package encapsulation;

import java.util.Scanner;

/**
 * 系统入口程序类，登录与退出
 * @author hyf
 * @date 2025/5/30
 */
public class StartSMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("欢迎使用我行我素购物管理系统");
            System.out.println("1. 登录系统");
            System.out.println("2. 退出");
            System.out.print("请选择，输入数字：");

            int choice = sc.nextInt();

            if (choice == 2) {
                System.out.println("感谢使用，再见！");
                break;
            } else if (choice == 1) {
                System.out.print("请输入用户名：");
                String username = sc.next();
                System.out.print("请输入密码：");
                String password = sc.next();

                // 验证用户名和密码
                if ("JadeBird".equals(username) && "0000".equals(password)) {
                    System.out.println("@登录成功：" + username + "@");
                    System.out.println("\n我行我素购物管理系统主菜单");
                    System.out.println("1. 客户信息管理");
                    System.out.println("2. 商品管理");
                    break;
                } else {
                    System.out.println("@您没有权限进入系统，请重新登录。@\n");
                }
            }
        }
        sc.close();
    }
}
