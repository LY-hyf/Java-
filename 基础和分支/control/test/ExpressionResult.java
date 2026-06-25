package control.test;

public class ExpressionResult {
    public static void main(String[] args) {
        boolean result = (3 + 40 % 6) > (9 / 2 * 3);
        System.out.println("(3+40%6) > (9/2*3) 的结果是：" + result);
        // 计算过程：
        // 40%6 = 4 → 3+4=7
        // 9/2=4（整数除法） → 4*3=12
        // 7 > 12 → false
    }
}