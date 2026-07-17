package demo;

import java.util.Scanner;

public class CharCounter {
    /**
     * 统计字符出现次数的方法
     * @param inputs 输入的字符串
     * @param word 要查找的字符
     * @return 字符出现的次数
     */
    public int counter(String inputs, String word) {
        int count = 0;
        char[] chars = new char[inputs.length()];
        for (int i = 0; i < inputs.length(); i++) {
            chars[i] = inputs.substring(i, i + 1).charAt(0);
        }
        char target = word.charAt(0);
        for (char c : chars) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CharCounter counter = new CharCounter();
        System.out.print("请输入一个字符串：");
        String inputs = scanner.nextLine();
        System.out.print("请输入要查找的字符：");
        String word = scanner.nextLine();
        int result = counter.counter(inputs, word);
        System.out.println("\"" + inputs + "\"中包含" + result + "个\"" + word + "\"。");
        scanner.close();
    }
}
