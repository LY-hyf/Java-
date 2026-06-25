package encapsulation;

import java.util.Scanner;

/**
 * 猜价格游戏类
 * 用户有3次机会猜测商品价格，根据猜测给出提示
 * @author hyf
 * @date 2025/5/30
 */
public class GuessGame {
    private Product product;
    private Scanner sc;
    private int maxChances;  // 最大猜测次数
    private int attempts;    // 已尝试次数

    /**
     * 构造方法 - 初始化游戏
     * @param product 商品对象
     */
    public GuessGame(Product product) {
        this.product = product;
        this.sc = new Scanner(System.in);
        this.maxChances = 3;
        this.attempts = 0;
    }

    /**
     * 开始游戏
     */
    public void start() {
        System.out.println("\n===== 幸运抽奖活动 =====");
        product.showInfo();
        System.out.println("你有" + maxChances + "次猜价格的机会！");
        System.out.println("========================\n");

        boolean guessed = false;

        for (int i = 1; i <= maxChances; i++) {
            System.out.print("第" + i + "次猜测，请输入价格：");
            double guess = sc.nextDouble();
            attempts++;

            if (Math.abs(guess - product.price) < 0.01) {  // 浮点数比较
                System.out.println("\n🎉 恭喜你！猜对了！ 🎉");
                guessed = true;
                break;
            } else if (guess > product.price) {
                System.out.println("太大了！");
                if (i < maxChances) {
                    System.out.println("再猜一次，小一些~\n");
                }
            } else {
                System.out.println("太小了！");
                if (i < maxChances) {
                    System.out.println("再猜一次，大一些~\n");
                }
            }
        }

        if (!guessed) {
            System.out.println("\n😭 " + maxChances + "次内没有猜对，下次努力吧！");
            System.out.println("正确答案是：" + product.price + "元");
        }

        System.out.println("\n游戏结束！");
    }

    /**
     * 关闭扫描器
     */
    public void close() {
        sc.close();
    }
}
