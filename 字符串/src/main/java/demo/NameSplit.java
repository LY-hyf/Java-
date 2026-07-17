package demo;

import java.util.Scanner;

/**
 *获取姓、名输出：输入一个姓名，获取姓和名并输出
 */
public class NameSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个姓名：");
        String name = scanner.nextLine();
        String surname = name.substring(0, 1);
        String givenName = name.substring(1);
        System.out.println("姓：" + surname);
        System.out.println("名：" + givenName);
        scanner.close();
    }
}
