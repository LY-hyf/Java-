package test;

import java.util.Scanner;

class CountHighScoreStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int classCount = 3;       // 3个班级
        int studentCount = 4;     // 每个班级4名学员
        int highScoreCount = 0;   // 成绩大于85分的学员总数

        // 外层循环控制班级数目
        for (int i = 1; i <= classCount; i++) {
            System.out.println("请输入第" + i + "个班级的成绩");

            int sum = 0;

            // 内层循环控制每个班级学员数目
            for (int j = 1; j <= studentCount; j++) {
                System.out.print("第" + j + "个学员的成绩：");
                int score = input.nextInt();
                sum += score;

                // 使用continue统计大于85分的学员人数
                if (score <= 85) {
                    continue;  // 不大于85分，跳过统计
                }
                highScoreCount++;
            }

            double average = (double) sum / studentCount;
            System.out.println("第" + i + "个班级参赛学员的平均分是：" + average);
            System.out.println();
        }

        System.out.println("成绩85分以上的学员人数有" + highScoreCount + "人");

        input.close();
    }
}