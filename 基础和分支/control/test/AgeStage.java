package control.test;

import java.util.Scanner;

public class AgeStage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年龄：");
        int age = input.nextInt();
        if (age < 18) {
            System.out.println("青少年");
        } else if (age < 30) {
            System.out.println("青年");
        } else {
            System.out.println("中老年");
        }
    }
}