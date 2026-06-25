package array;

public class ForEach2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("遍历二维数组：");
        for (int[] row : matrix) {      // 外层循环：每一行是一维数组
            for (int num : row) {
                System.out.print(num + " ");// 内层循环：遍历行中的每个元素
            }
            System.out.println();        // 换行
        }
    }
}
