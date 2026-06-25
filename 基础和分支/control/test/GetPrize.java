package control.test;

import java.util.Scanner;

public class GetPrize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("输入张浩的Java成绩：");
        int score = input.nextInt();

        if (score > 98) {
            System.out.println("老师说：不错，奖励一个MP4！");
        }

        input.close();
    }
}
