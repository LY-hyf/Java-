package control.test;

import java.util.Scanner;

public class Pay {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("输入消费总金额：");
        double total = input.nextDouble();
        double discount = 0.8;
        double finalPay = total * discount;
        System.out.println("消费总金额：" + finalPay);
    }
}
