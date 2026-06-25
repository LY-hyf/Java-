package encapsulation;

import java.util.Scanner;

/**
 * 更改管理员密码
 * @author hyf
 * @date 2025/5/30
 */
public class ChangePassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Administrator admin = new Administrator();
        admin.username = "admin1";
        admin.password = "111111";

        while (true) {
            System.out.print("请输入用户名: ");
            String name = input.next();
            System.out.print("请输入密码: ");
            String pwd = input.next();

            if (admin.login(name, pwd)) {
                System.out.print("请输入新密码: ");
                String newPwd = input.next();
                admin.changePassword(newPwd);
                break;
            } else {
                System.out.println("用户名和密码不匹配！您没有权限更新管理员信息。");
            }
        }
        input.close();
    }
}
