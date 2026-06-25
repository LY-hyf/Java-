package control.test;

import java.util.Scanner;

public class GetDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入一个四位数：");
        int num = input.nextInt();

        // 获取各位数字
        int thousand = num / 1000;      // 千位
        int hundred = num / 100 % 10;   // 百位
        int ten = num / 10 % 10;        // 十位
        int one = num % 10;             // 个位

        System.out.println("千位：" + thousand);
        System.out.println("百位：" + hundred);
        System.out.println("十位：" + ten);
        System.out.println("个位：" + one);

        input.close();
    }
}
