package test;

import java.util.Scanner;
class ATMSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPwd = "123456";
        int attempts = 0;
        int maxAttempts = 3;
        boolean verified = false;

        while (attempts < maxAttempts) {
            System.out.print("请输入密码：");
            String inputPwd = sc.next();
            attempts++;
            if (inputPwd.equals(correctPwd)) {
                verified = true;
                break;
            } else {
                System.out.println("密码错误，还剩" + (maxAttempts - attempts) + "次机会");
            }
        }
        if (verified) {
            System.out.print("请输入取款金额：");
            double amount = sc.nextDouble();
            System.out.println("取款成功！金额：" + amount + "元");
        } else {
            System.out.println("密码错误次数过多，账户已锁定！");
        }
        sc.close();
    }
}