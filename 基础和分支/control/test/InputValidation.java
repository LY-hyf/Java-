package control.test;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;

        System.out.println("=== 整数输入验证程序 ===");

        while (true) {
            System.out.print("请输入一个整数：");

            if (input.hasNextInt()) {
                num = input.nextInt();
                break;
            } else {
                System.out.println("❌ 输入错误，请重新输入！");
                input.next(); // 清空错误输入
            }
        }

        System.out.println("✅ 输入成功：" + num);
        input.close();
    }
}