package demo;

import service.UserService;

import java.util.Scanner;

/**
 * 用户注册登录演示（表示层）
 */
public class Demo {

    private static final UserService userService = new UserService();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("\n========== 欢迎使用 ==========");
            System.out.println("1. 注册");
            System.out.println("2. 登录");
            System.out.println("3. 退出");
            System.out.print("请选择：");
            int choice = input.nextInt();
            input.nextLine(); // 消费换行符

            switch (choice) {
                case 1:
                    register(input);
                    break;
                case 2:
                    login(input);
                    break;
                case 3:
                    flag = false;
                    System.out.println("已退出系统");
                    break;
                default:
                    System.out.println("输入无效，请重新选择");
            }
        }

        input.close();
    }

    private static void register(Scanner input) {
        System.out.println("\n--- 注册 ---");
        System.out.print("请输入用户名：");
        String username = input.nextLine().trim();
        System.out.print("请输入密码：");
        String password = input.nextLine();
        System.out.print("请确认密码：");
        String confirmPwd = input.nextLine();

        userService.register(username, password, confirmPwd);
    }

    private static void login(Scanner input) {
        System.out.println("\n--- 登录 ---");
        System.out.print("请输入用户名：");
        String username = input.nextLine().trim();
        System.out.print("请输入密码：");
        String password = input.nextLine();

        userService.login(username, password);
    }
}
