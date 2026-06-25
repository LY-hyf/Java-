package test;

import java.util.Scanner;

class BuyClothes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalClothes = 0;      // 总共买的衣服数量
        int maxClothesPerShop = 3; // 每家最多购买3件

        // 外层循环控制去每个专卖店（5家）
        for (int shop = 1; shop <= 5; shop++) {
            System.out.println("\n欢迎光临第" + shop + "家专卖店");

            // 内层循环控制买衣服过程（最多3件）
            for (int clothes = 1; clothes <= maxClothesPerShop; clothes++) {
                System.out.print("要离开吗（y/n）？");
                String choice = input.next();

                // 使用break退出内层循环
                if ("y".equals(choice)) {
                    break;  // 离开当前专卖店
                } else if ("n".equals(choice)) {
                    System.out.println("买了一件衣服");
                    totalClothes++;
                }
            }

            System.out.println("离店结账");
        }

        System.out.println("\n总共买了" + totalClothes + "件衣服");

        input.close();
    }
}
