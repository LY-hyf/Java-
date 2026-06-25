package array;

/**
 * 逆序输出5句话
 * @author 韩永发
 * @date 2026/5/28
 * @version 1.0
 * @param sentences 5句话数组
 * @return 逆序输出5句话
 */

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        String[] sentences = new String[5];
        Scanner input = new Scanner(System.in);

        System.out.println("请输入5句话：");
        for (int i = 0; i < sentences.length; i++) {
            System.out.print("第" + (i + 1) + "句话：");
            sentences[i] = input.nextLine();
        }

        System.out.println("\n逆序输出5句话为：");
        for (int i = sentences.length - 1; i >= 0; i--) {
            System.out.println(sentences[i]);
        }

        input.close();
    }
}
