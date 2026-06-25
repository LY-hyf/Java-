package control.test;

import java.util.Scanner;

public class ScoreEvaluate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入学员的结业考试成绩：");
        int score = input.nextInt();

        if (score >= 80) {
            System.out.println("良好");
        } else if (score >= 60) {
            System.out.println("中等");
        } else {
            System.out.println("差");
        }

        input.close();
    }
}
