package encapsulation;

import java.util.Scanner;
import java.util.Arrays;

/**
 * 数组元素插入器
 * 向数组指定位置插入新元素
 * @author hyf
 * @date 2026/6/1
 */
public class ArrayInserter {

    /**
     * 向数组指定位置插入元素
     * @param original 原数组
     * @param position 插入位置（1-based，从1开始）
     * @param element  要插入的元素
     * @return 插入后的新数组
     */
    public String[] insertElement(String[] original, int position, String element) {
        // 创建新数组（长度+1）
        String[] newArray = new String[original.length + 1];

        // 复制插入位置之前的元素
        for (int i = 0; i < position - 1; i++) {
            newArray[i] = original[i];
        }

        // 在指定位置插入新元素
        newArray[position - 1] = element;

        // 复制插入位置之后的元素
        for (int i = position - 1; i < original.length; i++) {
            newArray[i + 1] = original[i];
        }

        return newArray;
    }

    /**
     * 显示数组内容
     */
    public void displayArray(String[] arr, String title) {
        System.out.print(title);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayInserter inserter = new ArrayInserter();

        // 初始化原数组
        String[] original = {"苹果", "香蕉", "橙子", "葡萄", "西瓜"};

        System.out.println("===== 数组元素插入器 =====");

        // 显示插入前的数组
        inserter.displayArray(original, "\n插入前的数组：");

        // 输入插入位置
        System.out.print("\n请输入要插入的位置（1-" + (original.length + 1) + "）：");
        int position = sc.nextInt();

        // 验证位置有效性
        if (position < 1 || position > original.length + 1) {
            System.out.println("位置无效！请输入1到" + (original.length + 1) + "之间的数字。");
            sc.close();
            return;
        }

        // 输入要插入的元素
        System.out.print("请输入要插入的元素：");
        String element = sc.next();

        // 执行插入
        String[] newArray = inserter.insertElement(original, position, element);

        // 显示插入后的数组
        inserter.displayArray(newArray, "\n插入后的数组：");

        sc.close();
    }
}
