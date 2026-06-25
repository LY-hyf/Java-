package control.test;

import java.util.Scanner;

public class ExchangeGoods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入消费金额：");
        double amount = input.nextDouble();

        System.out.println("是否参加优惠换购活动：");
        System.out.println("1. 满50元，加2元换购百事可乐饮料1瓶");
        System.out.println("2. 满100元，加3元换购500ml可乐一瓶");
        System.out.println("3. 满100元，加10元换购5公斤面粉");
        System.out.println("4. 满200元，加10元换购1个苏泊尔炒菜锅");
        System.out.println("5. 满200元，加20元换购欧莱雅爽肤水一瓶");
        System.out.println("0. 不换购");
        System.out.print("请选择：");

        int choice = input.nextInt();
        double finalAmount = amount;
        String gift = "";

        switch (choice) {
            case 1:
                if (amount >= 50) {
                    finalAmount += 2;
                    gift = "百事可乐饮料1瓶";
                } else {
                    System.out.println("消费金额不足50元，不能参与此换购");
                }
                break;
            case 2:
                if (amount >= 100) {
                    finalAmount += 3;
                    gift = "500ml可乐一瓶";
                } else {
                    System.out.println("消费金额不足100元，不能参与此换购");
                }
                break;
            case 3:
                if (amount >= 100) {
                    finalAmount += 10;
                    gift = "5公斤面粉";
                } else {
                    System.out.println("消费金额不足100元，不能参与此换购");
                }
                break;
            case 4:
                if (amount >= 200) {
                    finalAmount += 10;
                    gift = "1个苏泊尔炒菜锅";
                } else {
                    System.out.println("消费金额不足200元，不能参与此换购");
                }
                break;
            case 5:
                if (amount >= 200) {
                    finalAmount += 20;
                    gift = "欧莱雅爽肤水一瓶";
                } else {
                    System.out.println("消费金额不足200元，不能参与此换购");
                }
                break;
            case 0:
                gift = "不换购";
                break;
            default:
                System.out.println("输入错误，不参与换购");
                break;
        }

        if (!gift.isEmpty() && !gift.equals("不换购")) {
            System.out.println("本次消费总金额：" + finalAmount);
            System.out.println("成功换购：" + gift);
        } else if (gift.equals("不换购")) {
            System.out.println("本次消费总金额：" + finalAmount);
        }

        input.close();
    }
}
