package exception;

import java.util.Scanner;

/**
 * 课程序号选择,输入异常抛出
 * @author hyf
 * @date 2026/6/2
 */
public class Course {
    public static void course() {
        Scanner input = new Scanner(System.in);
        try {
            String[] courses = new String[3];
            courses[0] = "C++";
            courses[1] = "Python";
            courses[2] = "Java";
            System.out.print("请输入课程序号：");
            int index = input.nextInt();
            System.out.println("你选择的课程是：" + courses[index - 1]);
        }
        catch (Exception e) {
            System.out.println("课程序号超出范围");
        }
        finally {
            input.close();
        }
    }

    public static void main(String[] args) {
        course();
    }
}
