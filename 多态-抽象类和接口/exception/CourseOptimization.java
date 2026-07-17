package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 课程序号选择,输入异常抛出(优化)
 * @author hyf
 * @date 2026/6/2
 */
public class CourseOptimization {
    public static void course() {
        // ① try-with-resources：自动关闭 Scanner，避免资源泄漏
        try (Scanner input = new Scanner(System.in)) {
            String[] courses = {"C++", "Python", "Java"}; // ② 简化数组初始化
            System.out.print("请输入课程序号（1-3）：");
            int index = input.nextInt();

            if (index < 1 || index > 3) {
                // ③ 用 IllegalArgumentException 更符合语义
                throw new IllegalArgumentException("课程序号超出范围，请输入1-3");
            }
            System.out.println("你选择的课程是：" + courses[index - 1]);

        } catch (InputMismatchException e) {
            // ④ 捕获非数字输入，给出友好提示
            System.err.println("输入错误：请输入数字！");
        } catch (IllegalArgumentException e) {
            // ⑤ 捕获范围越界，给出友好提示
            System.err.println("输入错误：" + e.getMessage());
        } finally {
            // ⑥ 无论是否异常，都执行
            System.out.println("欢迎提出建议");
        }
    }

    public static void main(String[] args) {
        course();
    }
}
