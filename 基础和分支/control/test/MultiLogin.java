package control.test;

import java.util.Scanner;

public class MultiLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("用户名：");
        String user = input.next();
        System.out.print("密码：");
        String pwd = input.next();
        if ((user.equals("admin") && pwd.equals("123")) ||
                (user.equals("zhangsan") && pwd.equals("zhangsan123"))) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }
}
