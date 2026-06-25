package control.test;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("输入第一个数字：");
        double a = input.nextDouble();

        System.out.print("输入运算符(+ - * /)：");
        String op = input.next();

        System.out.print("输入第二个数字：");
        double b = input.nextDouble();

        double result = 0;
        switch (op) {
            case "+": result = a + b; break;
            case "-": result = a - b; break;
            case "*": result = a * b; break;
            case "/":
                if (b != 0) result = a / b;
                else System.out.println("除数不能为0");
                break;
            default: System.out.println("运算符无效");
        }
        System.out.println("结果：" + result);
    }
}
