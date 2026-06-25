package control.test;

import java.util.Scanner;

public class ScoreStat {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("输入STB成绩");
        int stb = input.nextInt();
        System.out.print("输入Java成绩：");
        int java = input.nextInt();
        System.out.print("输入SQL成绩：");
        int sql = input.nextInt();

        int diff = java - sql;
        double avg = (stb + java + sql) / 3.0;

        System.out.println("STB\tJava\tSQL");
        System.out.println(stb+"\t" + java + "\t" + sql);
        System.out.println("Java和SQL的成绩差：" + Math.abs(diff));
        System.out.println("3门课的平均分是：" + avg);
    }
}