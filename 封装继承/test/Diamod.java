package test;


import java.util.Scanner;

// 21. 打印菱形
class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入行数（奇数）：");
        int n = sc.nextInt();
        int mid = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            int spaces = Math.abs(mid - i);
            int stars = n - 2 * spaces;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= stars; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
