package encapsulation;

import java.util.Scanner;

/**
 * 成绩统计类
 * 数组作为参数，计算平均分和最高分
 * @author hyf
 * @date 2026/6/1
 */
public class ScoreStat {

    /**
     * 计算平均成绩
     * @param scores 成绩数组
     * @return 平均分
     */
    public double calAvg(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return (double) sum / scores.length;
    }

    /**
     * 计算最高成绩
     * @param scores 成绩数组
     * @return 最高分
     */
    public int calMax(int[] scores) {
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (max < scores[i]) {
                max = scores[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScoreStat stat = new ScoreStat();
        int[] scores = new int[5];

        System.out.println("请输入五名参赛者的成绩：");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }

        double avgScore = stat.calAvg(scores);
        int maxScore = stat.calMax(scores);

        System.out.println("平均成绩：" + avgScore);
        System.out.println("最高成绩：" + maxScore);

        sc.close();
    }
}
