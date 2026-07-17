package demo;

import java.util.Scanner;

public class NumberFormatDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一串数字：");
        String input = scanner.nextLine();
        StringBuffer sb = new StringBuffer(input);
        // 从右边开始，每隔3位插入一个逗号
        for (int i = sb.length() - 3; i > 0; i = i - 3) {
            sb.insert(i, ",");
        }
        System.out.println(sb);
        scanner.close();
    }
}
