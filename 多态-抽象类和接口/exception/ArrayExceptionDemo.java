package exception;

/**
 * 测试自定义异常
 */
public class ArrayExceptionDemo {

    // 自定义方法，抛出自定义异常
    public static int getArrayElement(int[] arr, int index) throws MyArrayIndexOutOfBoundsException {
        // 检查下标是否越界
        if (index < 0 || index >= arr.length) {
            // 抛出自定义异常
            throw new MyArrayIndexOutOfBoundsException(
                    String.format("数组下标越界！索引：%d，数组长度：%d，有效范围：[0, %d]",
                            index, arr.length, arr.length - 1)
            );
        }
        return arr[index];
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            // 访问超出范围的下标
            int value = getArrayElement(numbers, 10);
            System.out.println("获取的值：" + value);
        } catch (MyArrayIndexOutOfBoundsException e) {
            System.out.println("捕获到自定义异常：" + e.getMessage());
            e.printStackTrace();
        }
    }
}