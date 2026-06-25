package control.test;

import java.util.Scanner;

public class LoginVerify {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入用户名：");
        String username = input.next();

        System.out.print("请输入密码：");
        String password = input.next();

        if (username.equals("admin") && password.equals("123456")) {
            System.out.println("登录成功！");
        } else {
            System.out.println("用户名或密码错误，登录失败！");
        }

        input.close();
    }
}
