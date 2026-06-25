package test;

import java.util.Scanner;

class Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 外层循环条件：i<3（控制3名顾客）
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入第" + i + "个人所购的三件商品的价格：");

            int discountCount = 0;  // 享受打折优惠的商品数量

            // 内层循环条件：j<3（每人买3件商品）
            for (int j = 1; j <= 3; j++) {
                double price = input.nextDouble();

                // 使用continue统计享受优惠的商品数量
                if (price < 300) {
                    continue;  // 价格低于300，不享受优惠，跳过统计
                }
                discountCount++;
            }

            System.out.println("第" + i + "个人共有" + discountCount + "件商品享受8折优惠！");
        }

        input.close();
    }
}
