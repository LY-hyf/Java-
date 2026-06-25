package encapsulation;

import java.util.Scanner;

/**
 * 三角形判断器
 * 判断三条边是否能构成三角形，并判断三角形形状
 * @author hyf
 * @date 2026/6/1
 */
public class TriangleJudge {

    /**
     * 判断是否能构成三角形
     */
    public boolean isTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    /**
     * 判断三角形形状
     * @return 形状描述
     */
    public String getShape(double a, double b, double c) {
        // 等边三角形
        if (a == b && b == c) {
            return "等边三角形";
        }
        // 等腰三角形
        if (a == b || a == c || b == c) {
            return "等腰三角形";
        }
        // 直角三角形（勾股定理，考虑浮点数精度）
        double a2 = a * a, b2 = b * b, c2 = c * c;
        if (Math.abs(a2 + b2 - c2) < 0.0001 ||
                Math.abs(a2 + c2 - b2) < 0.0001 ||
                Math.abs(b2 + c2 - a2) < 0.0001) {
            return "直角三角形";
        }
        return "普通三角形";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TriangleJudge judge = new TriangleJudge();

        System.out.println("===== 三角形判断器 =====");

        while (true) {
            System.out.println("\n请输入三角形的三条边长：");

            System.out.print("第一条边长：");
            double a = sc.nextDouble();
            System.out.print("第二条边长：");
            double b = sc.nextDouble();
            System.out.print("第三条边长：");
            double c = sc.nextDouble();

            // 判断边长是否合法（边长必须大于0）
            if (a <= 0 || b <= 0 || c <= 0) {
                System.out.println("边长必须大于0！");
            }
            // 判断是否能构成三角形
            else if (judge.isTriangle(a, b, c)) {
                String shape = judge.getShape(a, b, c);
                System.out.printf("边长为 %.2f, %.2f, %.2f 可以构成%s\n", a, b, c, shape);
            }
            else {
                System.out.printf("边长为 %.2f, %.2f, %.2f 不能构成三角形！\n", a, b, c);
            }

            // 询问是否继续
            System.out.print("\n是否继续判断？(y/n)：");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("n")) {
                System.out.println("程序结束，再见！");
                break;
            }
        }

        sc.close();
    }
}
