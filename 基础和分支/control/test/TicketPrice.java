package control.test;

import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price = 4000;
        System.out.print("请输入月份（1-12）：");
        int month = input.nextInt();
        System.out.print("请输入舱位（1-头等舱，2-经济舱）：");
        int seat = input.nextInt();
        double discount;
        if (month >= 5 && month <= 10) {
            if (seat == 1) discount = 0.9;
            else discount = 0.7;
        } else {
            if (seat == 1) discount = 0.6;
            else discount = 0.3;
        }
        double finalPrice = price * discount;
        System.out.println("机票价格：" + finalPrice + "元");
    }
}
