package control.test;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("交换前：a=" + a + ", b=" + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("交换后：a=" + a + ", b=" + b);
    }
}
