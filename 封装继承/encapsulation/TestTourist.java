package encapsulation;

import java.util.Scanner;

/**
 * 测试类
 * @author  hyf
 * @since 2026-5-30
 */
public class TestTourist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("请输入姓名：");
            String name = input.next();
            if (name.equals("n")) {
                System.out.println("退出程序");
                break;
            }
            System.out.print("请输入年龄：");
            int age = input.nextInt();
            Tourist t = new Tourist();
            t.name = name;
            t.age = age;
            t.show();
        }
        input.close();
    }
}