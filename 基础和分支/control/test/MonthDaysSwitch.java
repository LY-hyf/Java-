package control.test;

import java.util.Scanner;

public class MonthDaysSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入月份（1-12）：");
        int month = input.nextInt();
        int days;
        switch (month) {
            case 2:
                days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
        }
        System.out.println(month + "月有" + days + "天");
    }
}
