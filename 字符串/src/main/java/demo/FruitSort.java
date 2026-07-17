package demo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 水果排序：输入水果，按字典顺序排序输出
 */
public class FruitSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入水果名称，水果使用空格隔开：");
        String input = scanner.nextLine();
        String[] fruits = input.split(" ");
        Arrays.sort(fruits);
        System.out.println("按字典顺序排序后：");
        for (String fruit : fruits) {
            if (!fruit.isEmpty()) {
                System.out.println(fruit);
            }
        }
        scanner.close();
    }
}
