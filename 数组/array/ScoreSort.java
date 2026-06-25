package array;

/**
 * 成绩排序
 * @author 韩永发
 * @date 2026/5/28
 * @version 1.0
 * @param score 成绩数组
 * @return 成绩排序
 */
import java.util.Arrays;
import java.util.Scanner;
public class ScoreSort {
    public static void main(String[] args) {
        System.out.println("请输入5个成绩：");
        double[] score = new double[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < score.length; i++){
            System.out.print("请输入第" + (i + 1) + "个数：");
            score[i] = input.nextInt();
        }
        Arrays.sort(score);
        // 直接打印数组System.out.println(arr);输出：[D@15db9742  （看不懂的内存地址！）
        System.out.println("排序后成绩：" + Arrays.toString(score));
    }
}
