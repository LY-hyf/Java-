package array;

import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. 保存用户密码（假设初始密码为123456）
        int correctPassword = 123456;

        // 4. 记录密码输入次数
        int passwordAttempts = 0;
        final int MAX_ATTEMPTS = 3;
        boolean isPasswordVerified = false;

        // 5. 密码是否通过验证（最多3次机会）
        while (passwordAttempts < MAX_ATTEMPTS) {
            System.out.print("请输入密码：");
            int inputPassword = input.nextInt();
            passwordAttempts++;

            // 3. 用户密码验证
            if (inputPassword == correctPassword) {
                isPasswordVerified = true;
                System.out.println("密码正确，验证通过！");
                break;
            } else {
                System.out.println("密码错误！还剩" + (MAX_ATTEMPTS - passwordAttempts) + "次机会");
            }
        }

        // 密码验证失败，退出系统
        if (!isPasswordVerified) {
            System.out.println("密码错误次数过多，银行卡已被锁定！");
            input.close();
            return;
        }

        // 账户余额（假设初始余额为5000元）
        double balance = 5000.0;

        // 2. 取款金额处理
        boolean continueWithdraw = true;

        while (continueWithdraw) {
            System.out.println("\n========== ATM取款系统 ==========");
            System.out.println("当前余额：" + balance + "元");
            System.out.print("请输入取款金额：");
            double withdrawAmount = input.nextDouble();

            // 检查取款金额是否合法
            if (withdrawAmount <= 0) {
                System.out.println("取款金额必须大于0！");
            } else if (withdrawAmount > balance) {
                System.out.println("余额不足！当前余额为：" + balance + "元");
            } else if (withdrawAmount % 100 != 0) {
                System.out.println("取款金额必须是100的倍数！");
            } else {
                // 取款成功
                balance -= withdrawAmount;
                System.out.println("取款成功！请取走现金：" + withdrawAmount + "元");
                System.out.println("剩余余额：" + balance + "元");
            }

            // 询问是否继续取款
            System.out.print("\n是否继续取款？(y/n)：");
            String choice = input.next();
            if (!choice.equalsIgnoreCase("y")) {
                continueWithdraw = false;
                System.out.println("感谢使用ATM机，再见！");
            }
        }

        input.close();
    }
}
