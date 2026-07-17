package demo;

import java.util.Scanner;

/**
 *字符串查找：输入一个字符串，再输入字符，定位出现的位置
 */
public class StringSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = scanner.nextLine();
        System.out.print("请输入要查找的字符：");
        String searchChar = scanner.nextLine();
        char target = searchChar.charAt(0);
        System.out.println("字符'" + target + "'在字符串中的位置：");
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("未找到字符'" + target + "'");
        } else {
            System.out.println();
        }
        scanner.close();
    }
}
