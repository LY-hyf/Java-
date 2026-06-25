package test;

import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个正整数(1-10)：");
        int n = sc.nextInt();
        if (n < 1 || n > 10) {
            System.out.println("输入无效，程序结束！");
            sc.close();
            return;
        }
        int result = 1;
        System.out.print(n + "!=");
        for (int i = 1; i <= n; i++) {
            result *= i;
            if (i < n) {
                System.out.print(i + "*");
            } else {
                System.out.print(i);
            }
        }
        System.out.println("=" + result);
        sc.close();
    }
}
