package test;

import java.util.Scanner;
// 14. 输出一批整数中的最大值和最小值
class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入整数个数：");
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            System.out.print("请输入第" + i + "个数：");
            int num = sc.nextInt();
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);
        sc.close();
    }
}