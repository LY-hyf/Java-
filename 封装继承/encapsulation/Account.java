package encapsulation;

import java.util.Scanner;

/**
 * 银行账户类,存款取款业务办理
 * @author hyf
 * @date 2026/6/1
 */
public class Account {
    private double balance;  // 账户余额

    /**
     * 构造方法，初始余额为0
     */
    public Account() {
        this.balance = 0;
    }

    /**
     * 存款
     * @param amount 存款金额
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("存款成功");
        } else {
            System.out.println("存款金额必须大于0！");
        }
    }

    /**
     * 取款
     * @param amount 取款金额
     */
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("余额不足！当前余额：" + balance + "元");
        } else if (amount <= 0) {
            System.out.println("取款金额必须大于0！");
        } else {
            balance -= amount;
            System.out.println("取款成功");
        }
    }

    /**
     * 显示当前余额
     */
    public void showBalance() {
        System.out.println("\n***当前余额为：" + balance + "元***\n");
    }

    /**
     * 主方法 - 测试银行账户业务
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account();

        while (true) {
            System.out.println("1. 存款    2. 取款    0. 退出");
            System.out.print("请选择你需要办理的业务：");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("谢谢使用！");
                break;
            } else if (choice == 1) {
                System.out.print("请输入存款金额：");
                double amount = sc.nextDouble();
                account.deposit(amount);
                account.showBalance();
            } else if (choice == 2) {
                System.out.print("请输入取款金额：");
                double amount = sc.nextDouble();
                account.withdraw(amount);
                account.showBalance();
            } else {
                System.out.println("输入错误，请重新选择！");
            }
        }

        sc.close();
    }
}