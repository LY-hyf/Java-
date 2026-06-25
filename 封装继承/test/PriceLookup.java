package test;

import java.util.Scanner;

class PriceLookup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 商品信息
        String[] products = {"T恤", "网球鞋", "网球拍"};
        double[] prices = {245.0, 380.0, 580.0};

        System.out.println("******************************");
        System.out.println("请选择购买的商品编号：");
        System.out.println("1. T恤  2. 网球鞋  3. 网球拍");
        System.out.println("******************************");

        String continueShopping = "y";

        // while循环结构
        while (continueShopping.equals("y")) {
            System.out.print("请输入商品编号：");
            int id = input.nextInt();

            if (id >= 1 && id <= 3) {
                System.out.println(products[id - 1] + "   ¥" + prices[id - 1]);
            } else {
                System.out.println("商品编号无效！");
            }

            System.out.print("是否继续（y/n）：");
            continueShopping = input.next();
        }

        System.out.println("程序结束！");
        input.close();
    }
}
