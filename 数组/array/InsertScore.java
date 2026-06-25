package array;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 成绩插入
 * @author 韩永发
 * @date 2026/5/28
 * @version 1.0
 * @param score 成绩数组
 * @param newScore 新成绩
 * @param insertPosition 插入位置
 * @return 插入后成绩
 */
public class InsertScore {
    public static void main(String[] args) {
        double[] score = {99,85,82,63,60,0};
        System.out.println("请输入新成绩：");
        Scanner input = new Scanner(System.in);
        double newScore = input.nextDouble();
        System.out.println("请输入插入位置：");
        int insertPosition = input.nextInt();
        for (int i = 0; i < score.length; i++) {
            if (i == insertPosition) {
                score[i] = newScore;
                break;
            }
        }
        Arrays.sort(score);
        System.out.println("插入后成绩：" + Arrays.toString(score));
    }
}
