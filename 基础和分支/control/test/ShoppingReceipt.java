package control.test;

public class ShoppingReceipt {
    public static void main(String[] args) {
        // 商品信息
        String[] items = {"T恤", "网球鞋", "网球拍"};
        int[] prices = {245, 570, 320};
        int[] counts = {2, 1, 1};

        double discount = 0.8;
        double total = 0;

        System.out.println("购买物品\t单价\t个数\t金额");
        for (int i = 0; i < items.length; i++) {
            int amount = prices[i] * counts[i];
            total += amount;
            System.out.println(items[i] + "\t¥" + prices[i] + "\t" + counts[i] + "\t¥" + amount);
        }

        double finalPay = total * discount;
        double paid = 1500;
        double change = paid - finalPay;
        int points = (int)(finalPay / 100) * 3;  // 每100元积3分

        System.out.println("折扣：8折");
        System.out.println("消费总金额：¥" + finalPay);
        System.out.println("实际交费：¥" + paid);
        System.out.println("找钱：¥" + change);
        System.out.println("本次购物所获的积分是：" + points);
    }
}
