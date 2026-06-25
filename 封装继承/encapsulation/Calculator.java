package encapsulation;

import java.util.Scanner;

/**
 * 计算器类
 * 包含加、减、乘、除方法，支持用户选择运算符
 * @author hyf
 * @date 2026/6/1
 */
public class Calculator {

    // 加法
    public double add(double a, double b) {
        return a + b;
    }

    // 减法
    public double subtract(double a, double b) {
        return a - b;
    }

    // 乘法
    public double multiply(double a, double b) {
        return a * b;
    }

    // 除法
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("错误：除数不能为0！");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("===== 简易计算器 =====");

        // 输入第一个数字
        System.out.print("请输入第一个数字：");
        double num1 = sc.nextDouble();

        // 选择运算符
        System.out.println("请选择运算符：1.加法(+)  2.减法(-)  3.乘法(*)  4.除法(/)");
        System.out.print("请输入选项(1-4)：");
        int choice = sc.nextInt();

        // 输入第二个数字
        System.out.print("请输入第二个数字：");
        double num2 = sc.nextDouble();

        double result = 0;
        String operator = "";
        boolean valid = true;

        // 根据选择执行对应运算
        switch (choice) {
            case 1:
                result = calc.add(num1, num2);
                operator = "+";
                break;
            case 2:
                result = calc.subtract(num1, num2);
                operator = "-";
                break;
            case 3:
                result = calc.multiply(num1, num2);
                operator = "*";
                break;
            case 4:
                result = calc.divide(num1, num2);
                operator = "/";
                if (num2 == 0) valid = false;
                break;
            default:
                System.out.println("无效的选择！");
                valid = false;
        }

        if (valid && !Double.isNaN(result)) {
            System.out.println("\n计算结果：" + num1 + " " + operator + " " + num2 + " = " + result);
        }

        sc.close();
    }
}
