package array;

/**
 * 求4家店的最低手机价格
 * @author 韩永发
 * @date 2026/5/28
 * @version 1.0
 * @param prices 价格数组
 * @param min 最低价格
 * @return 最低价格
 */
import java.util.Scanner;

public class MinPrice {
    public static void main(String[] args) {
        // 1. 定义数组存储价格，并利用循环输入
        double[] prices = new double[4];
        Scanner input = new Scanner(System.in);

        System.out.println("请输入4家店的手机价格：");
        for (int i = 0; i < prices.length; i++) {
            System.out.print("第" + (i + 1) + "家店的价格：");
            prices[i] = input.nextDouble();
        }

        // 2. 定义变量min保存当前的最低价
        double min = prices[0];

        // 3. 将min和数组中的其余元素依次比较
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
        }

        System.out.println("\n4家店的最低手机价格为：" + min);
        input.close();
    }
}
