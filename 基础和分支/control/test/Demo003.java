package control.test;

public class Demo003 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // 使用加法运算符（+）
        int sum = a + b;
        System.out.println("a + b = " + sum + "  // 10 + 3 = 13，结果为加法运算");

        // 使用减法运算符（-）
        int difference = a - b;
        System.out.println("a - b = " + difference + "  // 10 - 3 = 7，结果为减法运算");

        // 使用乘法运算符（*）
        int product = a * b;
        System.out.println("a * b = " + product + "  // 10 * 3 = 30，结果为乘法运算");

        // 使用除法运算符（/）
        int quotient = a / b;
        System.out.println("a / b = " + quotient + "  // 10 / 3 = 3，结果为整数除法，商为3");

        // 使用取余（取模）运算符（%）
        int remainder = a % b;
        System.out.println("a % b = " + remainder + "  // 10 % 3 = 1，结果为取余运算，余数为1");
    }
}
