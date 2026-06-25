package test;

import java.util.Scanner;

class Pay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 商品信息
        String[] products = {"T恤", "网球鞋", "网球拍"};
        double[] prices = {245.0, 380.0, 580.0};

        double total = 0;  // 总金额
        double discount = 0.8;  // 折扣

        System.out.println("***********************************************");
        System.out.println("请选择购买的商品编号：");
        System.out.println("1. T恤  2. 网球鞋  3. 网球拍");
        System.out.println("***********************************************");

        String continueShopping = "y";

        // while循环输入商品
        while (continueShopping.equals("y")) {
            System.out.print("请输入商品编号：");
            int id = input.nextInt();
            System.out.print("请输入购买数量：");
            int quantity = input.nextInt();

            if (id >= 1 && id <= 3) {
                double itemTotal = prices[id - 1] * quantity;
                total += itemTotal;
                System.out.println(products[id - 1] + "￥" + prices[id - 1]);
                System.out.println("数量 " + quantity);
                System.out.println("合计￥" + itemTotal);
            } else {
                System.out.println("商品编号无效！");
            }

            System.out.print("是否继续（y/n）：");
            continueShopping = input.next();
        }

        // 结账计算
        double payable = total * discount;
        System.out.println("折扣：" + discount);
        System.out.println("应付金额：" + payable);

        System.out.print("实付金额：");
        double paid = input.nextDouble();

        double change = paid - payable;
        System.out.println("找钱：" + change);

        input.close();
    }
}
