package test;

import java.util.Scanner;

class AdditionTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入一个值：");
        int value = input.nextInt();

        System.out.println("根据这个值可以输出以下加法表：");

        // 使用for循环输出加法表
        for (int i = 0; i <= value; i++) {
            System.out.println(i + " + " + (value - i) + " = " + value);
        }

        input.close();
    }
}
