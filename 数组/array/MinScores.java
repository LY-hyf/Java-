package array;

/**
 * 查找数组中的最低积分及其下标
 * @author 韩永发
 * @date 2026/5/28
 * @version 1.0
 * @param scores 积分数组
 * @return 最低积分及其下标
 */
public class MinScores {
    public static void main(String[] args) {
        // 定义积分数组
        int[] scores = {85, 92, 78, 60, 88, 2, 95, 70, 66, 80};

        // 假设第一个为最低
        int min = scores[0];
        int minIndex = 0;

        // 遍历查找最低积分及其下标
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
                minIndex = i;
            }
        }

        System.out.println("最低积分是：" + min);
        System.out.println("最低积分所在下标是：" + minIndex);
    }
}
