package test;

import java.util.Scanner;

class PayGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("青岛迷你游戏平台 > 游戏币支付");

        int type = 0;
        double pricePerHour = 0;
        String typeName = "";

        // 循环选择游戏类型
        while (true) {
            System.out.println("请选择您玩的游戏类型：");
            System.out.println("1. 牌类");
            System.out.println("2. 休闲竞技类");
            System.out.print("请输入游戏类型（1/2）：");
            type = input.nextInt();

            if (type == 1) {
                pricePerHour = 10;
                typeName = "牌类";
                break;
            } else if (type == 2) {
                pricePerHour = 20;
                typeName = "休闲竞技类";
                break;
            } else {
                System.out.println("输入有误，请重新选择！");
            }
        }

        System.out.print("请您输入游戏时长（小时）：");
        int hours = input.nextInt();

        double totalPrice = pricePerHour * hours;
        double discount = 1.0;
        String discountInfo = "";

        // 根据时长判断折扣
        if (hours > 10) {
            discount = 0.5;
            discountInfo = "5折";
        } else {
            discount = 0.8;
            discountInfo = "8折";
        }

        totalPrice = totalPrice * discount;

        System.out.println("您玩的是" + typeName + "游戏，时长是：" + hours + "小时，可以享受" + discountInfo + "优惠");
        System.out.println("您需要支付" + (int)totalPrice + "个游戏币");

        input.close();
    }
}