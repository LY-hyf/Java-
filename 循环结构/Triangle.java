package org.example;

/**
 * 等腰三角形
 */
public class Triangle {
    public static void main(String[] args) {
        int n = 5;  // 三角形高度

        // 外层循环：控制行数
        for (int i = 1; i <= n; i++) {
            //打印空格
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 打印星号
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
//            System.out.println("*");
//            // 换行
            System.out.println();
        }
    }
}