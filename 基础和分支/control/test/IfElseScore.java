package control.test;

import java.util.Scanner;

public class IfElseScore {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入张浩的java成绩:");
        int score = input.nextInt();
        if (score>98){
            System.out.println("老师说：不错，奖励一个MP4");
        }
        else{
            System.out.println("老师说：去编码");
        }
    }
}
