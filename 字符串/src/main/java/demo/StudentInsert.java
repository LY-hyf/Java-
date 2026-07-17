package demo;

import java.util.Scanner;

/**
 * 模拟插入学生数据到数据库
 * 输入学生信息，模拟数据库插入操作并显示插入结果
 */
public class StudentInsert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("模拟插入学生数据到数据库");
        System.out.print("请输入学号：");
        String id = scanner.nextLine();
        System.out.print("请输入姓名：");
        String name = scanner.nextLine();
        System.out.print("请输入年龄：");
        String age = scanner.nextLine();
        System.out.print("请输入性别：");
        String gender = scanner.nextLine();
        System.out.println("\n插入数据到数据库");
        System.out.println("INSERT INTO student VALUES ('" + id + "', '" + name + "', " + age + ", '" + gender + "');");
        System.out.println("数据插入成功！");
        System.out.println("\n插入的学生信息如下：");
        System.out.println("学号：" + id);
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("性别：" + gender);
        scanner.close();
    }
}
