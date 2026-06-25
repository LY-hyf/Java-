package control.test;

import java.util.Scanner;

public class LuckyDraw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入四位会员卡号：");
        int cardNo = input.nextInt();

        int thousands = cardNo / 1000;
        int hundreds = cardNo / 100 % 10;
        int tens = cardNo / 10 % 10;
        int ones = cardNo % 10;

        int sum = thousands + hundreds + tens + ones;
        boolean isLucky = sum > 20;

        System.out.println("会员卡号：" + cardNo);
        System.out.println("千位：" + thousands + "，百位：" + hundreds +
                "，十位：" + tens + "，个位：" + ones);
        System.out.println("各位之和：" + sum);
        System.out.println("是否是幸运顾客：" + isLucky);
    }
}
