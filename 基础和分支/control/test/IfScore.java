package control.test;

import java.util.Scanner;
public class IfScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入张浩的java成绩:");
        int score = input.nextInt();
        System.out.println("张浩的音乐成绩是：");
        int score_music = input.nextInt();
        if (score > 98 && score_music > 80) {
            System.out.println("老师说：不错，奖励一个MP4");
        }
        else if (score == 100 && score_music > 70) {
            System.out.println("老师说：不错，奖励一个MP4");
        }
    }    
}



