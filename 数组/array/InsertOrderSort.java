package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 子类：继承父类，对升序序列进行插入操作
 * @author 韩永发
 * @date 2026/5/28
 * @version 1.0
 */
public class InsertOrderSort extends ReverseOrderSort {

    // 构造方法
    public InsertOrderSort(String[] originalCharacter) {
        super(originalCharacter);  // 调用父类构造方法
    }

    /**
     * 向升序序列中插入新元素
     * @param newElement 要插入的新元素
     * @param position 插入位置
     * @return 插入后的新数组
     */
    public String[] insertToAscending(String newElement, int position) {
        // 1. 获取父类的升序序列（关键！）
        String[] ascending = super.getAscendingSequence();

        // 2. 参数校验
        if (position < 0 || position > ascending.length) {
            System.out.println("插入位置无效！有效范围：0-" + ascending.length);
            return ascending;
        }

        // 3. 创建新数组（长度+1）
        String[] result = new String[ascending.length + 1];

        // 4. 复制插入位置前的元素
        for (int i = 0; i < position; i++) {
            result[i] = ascending[i];
        }

        // 5. 插入新元素
        result[position] = newElement;

        // 6. 复制插入位置后的元素（后移）
        for (int i = position; i < ascending.length; i++) {
            result[i + 1] = ascending[i];
        }

        // 7. 对结果数组进行升序排序
        Arrays.sort(result);

        return result;
    }

    /**
     * 交互式插入（带用户输入）
     */
    public void interactiveInsert() {
        // 获取当前升序序列
        String[] currentAscending = super.getAscendingSequence();
        System.out.println("当前升序序列：" + Arrays.toString(currentAscending));

        Scanner input = new Scanner(System.in);

        System.out.print("请输入要插入的字符：");
        String newChar = input.nextLine();

        System.out.print("请输入插入位置（0-" + currentAscending.length + "）：");
        int position = input.nextInt();

        // 执行插入
        String[] result = insertToAscending(newChar, position);
        System.out.println("插入后的升序序列：" + Arrays.toString(result));

        input.close();
    }

    /**
     * 测试 main 方法
     */
    public static void main(String[] args) {
        // 原始数组
        String[] originalCharacter = {"a", "c", "u", "b", "e", "p", "f", "z"};

        // 创建子类对象
        InsertOrderSort insertSort = new InsertOrderSort(originalCharacter);

        System.out.println("========== 测试1：直接插入 ==========");
        // 直接调用插入方法
        String[] result1 = insertSort.insertToAscending("d", 3);
        System.out.println("插入 'd' 到位置3：" + Arrays.toString(result1));

        System.out.println("\n========== 测试2：插入到开头 ==========");
        String[] result2 = insertSort.insertToAscending("a", 0);
        System.out.println("插入 'a' 到位置0：" + Arrays.toString(result2));

        System.out.println("\n========== 测试3：插入到末尾 ==========");
        String[] result3 = insertSort.insertToAscending("z", 8);
        System.out.println("插入 'z' 到末尾：" + Arrays.toString(result3));

        System.out.println("\n========== 测试4：交互式插入 ==========");
        insertSort.interactiveInsert();
    }
}
