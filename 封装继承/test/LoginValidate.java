package test;


import java.util.Scanner;

// 33. 登录验证（3次锁定）
class LoginValidate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctUser = "admin";
        String correctPwd = "123456";
        int attempts = 0;
        boolean success = false;

        while (attempts < 3) {
            System.out.print("请输入用户名：");
            String user = sc.next();
            System.out.print("请输入密码：");
            String pwd = sc.next();
            attempts++;
            if (user.equals(correctUser) && pwd.equals(correctPwd)) {
                success = true;
                break;
            } else {
                System.out.println("验证失败，还剩" + (3 - attempts) + "次机会");
            }
        }
        if (success) {
            System.out.println("登录成功！");
        } else {
            System.out.println("验证失败3次，账户已锁定！");
        }
        sc.close();
    }
}