package array;

/**
 * 数组逆序并处理负数
 * 将原数组逆序排列，同时将负数元素替换为0。
 * @author 韩永发
 * @date 2026/5/28
 * @version 1.0
 * @param original 原数组
 * @param value 原数组元素
 * @return 逆序并处理后的数组
 */

public class ReverseAndProcess {
    public static void main(String[] args) {
        // 原数组
        int[] original = {1, 3, -1, 5, -2};

        System.out.println("原数组为：");
        for (int num : original) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 逆序并处理：负数变0
        int[] result = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            // 逆序取原数组元素
            int value = original[original.length - 1 - i];
            // 负数变0
            if (value < 0) {
                value = 0;
            }
            result[i] = value;
        }

        System.out.println("逆序并处理后的数组为：");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
