package array;

public class OneDimensionalArray {
    public static void main(String[] args) {

        // ========== 方式1：声明并分配空间（先声明，后初始化值）==========
        // 1.1 先声明，再分配空间
        int[] arr1;           // 声明
        arr1 = new int[5];    // 分配空间，默认值都是0

        // 1.2 声明的同时分配空间
        int[] arr2 = new int[5];


        // ========== 方式2：声明并初始化（直接赋值）==========
        // 2.1 静态初始化 - 标准写法
        int[] arr3 = new int[]{1, 2, 3, 4, 5};

        // 2.2 静态初始化 - 简化写法（推荐）
        int[] arr4 = {1, 2, 3, 4, 5};

        // 2.3 分步写法
        int[] arr5;
        arr5 = new int[]{1, 2, 3, 4, 5};


        // ========== 方式3：使用变量指定长度 ==========
        int length = 10;
        int[] arr6 = new int[length];


        // ========== 方式4：使用循环赋值 ==========
        int[] arr7 = new int[5];
        for (int i = 0; i < arr7.length; i++) {
            arr7[i] = i + 1;
        }


        // ========== 不同数据类型的数组默认值 ==========
        int[] intArr = new int[3];           // 默认值：0
        double[] doubleArr = new double[3];  // 默认值：0.0
        boolean[] boolArr = new boolean[3];  // 默认值：false
        char[] charArr = new char[3];        // 默认值：'\u0000'（空字符）
        String[] strArr = new String[3];     // 默认值：null


        // ========== 其他声明方式（不推荐，但合法）==========
        int arr8[] = new int[5];     // C语言风格（不推荐）
        int []arr9 = new int[5];     // 空格位置不同
    }
}