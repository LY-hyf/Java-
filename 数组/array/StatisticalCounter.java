package array;

/**
 * 统计1-3之间的数字个数并判断是否合法
 * @author 韩永发
 * @date 2026/5/28
 * @version 1.0
 * @param numbers 1-3之间的数字数组
 * @param count 1-3之间的数字个数
 * @param invalidCount 非法数字个数
 * @return 1-3之间的数字个数
 */
import java.util.Scanner;

public class StatisticalCounter {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner input = new Scanner(System.in);

        // 统计计数器：count[1]表示数字1的个数，count[2]表示数字2的个数，count[3]表示数字3的个数
        int[] count = new int[4];  // 索引0不用，只用1-3
        int invalidCount = 0;      // 非法数字个数

        System.out.println("请输入10个数字：");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();

            // 统计
            if (numbers[i] >= 1 && numbers[i] <= 3) {
                count[numbers[i]]++;
            } else {
                invalidCount++;
            }
        }

        // 输出结果
        for (int i = 1; i <= 3; i++) {
            System.out.println("数字 " + i + " 的个数: " + count[i]);
        }
        System.out.println("非法数字的个数: " + invalidCount);

        input.close();
    }
}
