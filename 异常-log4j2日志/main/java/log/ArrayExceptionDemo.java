package log;

/**
 * 自定义异常类，定义数组越界异常
 * @author hyf
 * @date 2026/6/3
 */
public class ArrayExceptionDemo {

    // 自定义方法，模拟数组下标越界
    public static int getArrayElement(int[] arr, int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("数组下标越界！索引：" + index + "，数组长度：" + arr.length);
        }
        return arr[index];
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            // 访问超出范围的下标
            int value = getArrayElement(numbers, 10);
            System.out.println("获取的值：" + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("捕获到异常：" + e.getMessage());
            e.printStackTrace();
        }
    }
}