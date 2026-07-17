package demo;

import java.util.Scanner;

/**
 * 请输入一个日期（年月日），最终输出 xxxx年xx月xx日
 * 从控制台分别输入年、月、日，格式化后输出
 */
public class DateFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个日期（年月日）");
        System.out.print("请输入年份：");
        String year = scanner.nextLine();
        System.out.print("请输入月份：");
        String month = scanner.nextLine();
        System.out.print("请输入日期：");
        String day = scanner.nextLine();
        System.out.println("最终输出：" + year + "年" + month + "月" + day + "日");
        scanner.close();
    }
}
