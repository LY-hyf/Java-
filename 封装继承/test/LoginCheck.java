package test;

import java.util.Scanner;

class LoginCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String correctUsername = "jim";
        String correctPassword = "123456";
        int maxAttempts = 3;  // 最多验证3次

        // 循环验证，最多3次
        for (int i = 1; i <= maxAttempts; i++) {
            System.out.print("请输入用户名：");
            String username = input.next();
            System.out.print("请输入密码：");
            String password = input.next();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("欢迎登录MyShopping系统！");
                break;  // 登录成功，退出循环
            } else {
                int remaining = maxAttempts - i;
                if (remaining > 0) {
                    System.out.println("输入错误！您还有" + remaining + "次机会！");
                } else {
                    System.out.println("输入错误！您还有0次机会！");
                    System.out.println("账户已锁定！");
                }
            }
        }

        input.close();
    }
}
