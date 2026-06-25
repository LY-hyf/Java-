package control.test;

import java.util.Scanner;

public class MonthDaysIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入月份（1-12）：");
        int month = input.nextInt();
        int days;
        if (month == 2) {
            days = 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else {
            days = 31;
        }
        System.out.println(month + "月有" + days + "天");
    }
}
