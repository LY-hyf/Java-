package demo;

import java.util.Scanner;

/**
 * 判断学生登录是否成功
 * 预设学号和密码，用户输入后比对验证
 */
public class StudentLogin {
    public static void main(String[] args) {
        String[][] students = {
            {"1001", "123456"},
            {"1002", "abcdef"},
            {"1003", "111111"},
            {"1004", "888888"}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学号：");
        String id = scanner.nextLine();
        System.out.print("请输入密码：");
        String password = scanner.nextLine();
        boolean loginSuccess = false;
        for (String[] student : students) {
            if (student[0].equals(id) && student[1].equals(password)) {
                loginSuccess = true;
                break;
            }
        }
        if (loginSuccess) {
            System.out.println("登录成功！欢迎进入学生系统。");
        } else {
            System.out.println("登录失败！学号或密码错误。");
        }
        scanner.close();
    }
}
