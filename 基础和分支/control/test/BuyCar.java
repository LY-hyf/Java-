package control.test;

import java.util.Scanner;

public class BuyCar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入银行存款（万元）：");
        double deposit = input.nextDouble();

        if (deposit > 500) {
            System.out.println("买凯迪拉克");
        } else if (deposit > 100) {
            System.out.println("买帕萨特");
        } else if (deposit > 50) {
            System.out.println("买依兰特");
        } else if (deposit > 10) {
            System.out.println("买奥托");
        } else {
            System.out.println("买捷安特");
        }

        input.close();
    }
}