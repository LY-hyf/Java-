package encapsulation;

import java.util.Scanner;

/**
 * 图形生成器
 * 根据输入的行数和字符打印图形
 * @author hyf
 * @date 2026/6/1
 */
public class ShapeGenerator {

    /**
     * 打印直角三角形（左对齐）
     * @param rows 行数
     * @param ch   打印字符
     */
    public void printRightTriangle(int rows, char ch) {
        System.out.println("\n=== 直角三角形 ===");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    /**
     * 打印等腰三角形（金字塔形）
     * @param rows 行数
     * @param ch   打印字符
     */
    public void printPyramid(int rows, char ch) {
        System.out.println("\n=== 等腰三角形 ===");
        for (int i = 1; i <= rows; i++) {
            // 打印空格
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // 打印字符
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    /**
     * 打印倒直角三角形
     * @param rows 行数
     * @param ch   打印字符
     */
    public void printInvertedTriangle(int rows, char ch) {
        System.out.println("\n=== 倒直角三角形 ===");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShapeGenerator generator = new ShapeGenerator();

        System.out.println("===== 图形生成器 =====");

        // 输入行数
        System.out.print("请输入行数：");
        int rows = sc.nextInt();

        // 输入打印字符
        System.out.print("请输入要打印的字符：");
        char ch = sc.next().charAt(0);

        // 选择图形类型
        System.out.println("请选择图形：1.直角三角形  2.等腰三角形  3.倒直角三角形");
        System.out.print("请输入选项(1-3)：");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                generator.printRightTriangle(rows, ch);
                break;
            case 2:
                generator.printPyramid(rows, ch);
                break;
            case 3:
                generator.printInvertedTriangle(rows, ch);
                break;
            default:
                System.out.println("无效选择！");
        }

        sc.close();
    }
}
