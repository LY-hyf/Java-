package control.test;

import java.util.Scanner;

public class CompareScore {
    public static void main(String[] args) {
        int liSi = 80;
        Scanner input = new Scanner(System.in);

        System.out.print("输入学员张三成绩：");
        int zhangSan = input.nextInt();

        boolean isBig = zhangSan > liSi;
        System.out.println("张三成绩比李四高吗？" + isBig);
    }
}
