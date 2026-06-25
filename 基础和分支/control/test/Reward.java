package control.test;

import java.util.Scanner;

public class Reward {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入小明的考试成绩：");
        int score = input.nextInt();

        if (score == 100) {
            System.out.println("爸爸给他买辆车");
        } else if (score >= 90) {
            System.out.println("妈妈给他买MP4");
        } else if (score >= 60) {
            System.out.println("妈妈给他买本参考书");
        } else {
            System.out.println("什么都不买");
        }

        input.close();
    }
}
