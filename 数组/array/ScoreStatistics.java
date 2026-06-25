package array;


import java.util.Scanner;

/**
 * 成绩统计系统 —— 多班级成绩录入与统计分析
 * <p>支持录入多个班级的学生成绩，自动计算每个班级的成绩总和、平均分、
 * 85分以上人数，并汇总全校的总成绩、总人数、全校平均分及85分以上总人数。</p>
 *
 * @author 韩永发
 * @version 1.0
 * @date 2026/5/29
 */
public class ScoreStatistics {
    /**
     * 程序入口 —— 启动成绩统计系统
     * <p>依次完成以下操作：</p>
     * <ol>
     *   <li>输入班级数目</li>
     *   <li>逐班输入学生人数及每个学生的成绩</li>
     *   <li>输出每个班级的成绩总和、平均分、85分以上人数</li>
     *   <li>输出全校汇总统计结果</li>
     * </ol>
     *
     * @param args 命令行参数（未使用）
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. 输入班级数目
        System.out.print("请输入班级数目：");
        int classCount = input.nextInt();

        // 用于统计所有班级的总和及总人数
        double totalScoreSum = 0;
        int totalStudentCount = 0;
        int totalAbove85Count = 0;

        // 遍历每个班级
        for (int i = 1; i <= classCount; i++) {
            System.out.println("\n========== 第" + i + "个班级 ==========");

            // 输入该班级的学生人数
            System.out.print("请输入第" + i + "个班级的学生人数：");
            int studentCount = input.nextInt();

            // 创建成绩数组
            double[] scores = new double[studentCount];

            // 该班级的统计变量
            double classScoreSum = 0;
            int classAbove85Count = 0;

            // 输入每个学生的成绩
            for (int j = 0; j < studentCount; j++) {
                System.out.print("请输入第" + (j + 1) + "个学生的成绩：");
                scores[j] = input.nextDouble();
                classScoreSum += scores[j];

                // 记录85分以上学员人数
                if (scores[j] > 85) {
                    classAbove85Count++;
                }
            }

            // 该班级的平均成绩
            double classAvg = classScoreSum / studentCount;

            // 输出该班级的统计结果
            System.out.println("\n--- 第" + i + "个班级统计结果 ---");
            System.out.println("成绩总和：" + classScoreSum);
            System.out.println("平均成绩：" + classAvg);
            System.out.println("85分以上学员人数：" + classAbove85Count);

            // 累加到总统计
            totalScoreSum += classScoreSum;
            totalStudentCount += studentCount;
            totalAbove85Count += classAbove85Count;
        }

        // 输出所有班级的总统计
        System.out.println("\n========== 全校统计结果 ==========");
        System.out.println("所有班级成绩总和：" + totalScoreSum);
        System.out.println("全校总人数：" + totalStudentCount);
        System.out.println("全校平均成绩：" + (totalScoreSum / totalStudentCount));
        System.out.println("全校85分以上学员总人数：" + totalAbove85Count);

        input.close();
    }
}
