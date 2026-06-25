package control.test;

import java.util.Scanner;

public class DiscountJudge {
    public static void main(String[] args) {
        double originalPrice = 245.0;  // 以T恤为例
        Scanner input = new Scanner(System.in);

        System.out.print("请输入折扣（如0.8表示8折）：");
        double discount = input.nextDouble();

        double finalPrice = originalPrice * discount;
        boolean isBelow100 = finalPrice < 100;

        System.out.println("原价：" + originalPrice);
        System.out.println("折扣后价格：" + finalPrice);
        System.out.println("是否低于100元：" + isBelow100);
    }
}
