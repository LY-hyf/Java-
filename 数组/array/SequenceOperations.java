package array;

/*
 * 序列操作
 * 1. 遍历输出序列
 * 2. 求序列总和
 * 3. 判断序列中是否存在某个数
 * @author 韩永发
 * @date 2026/5/28
 * @version 1.0
 * @param sequence 序列
 * @param sumSequence 序列总和
 * @param flag 是否存在某个数
 * @param num 输入的数
 * @param input 输入流
 * @return 遍历输出
 * @return 序列总和
 * @return 是否存在某个数
 */
import java.util.Scanner;
public class SequenceOperations {
    public static void main(String[] args) {
        int[] sequence = new int[]{8,4,2,1,23,344,12};
        int sumSequence = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数:");
        double num = input.nextDouble();
        System.out.println("遍历输出:");
        for (int i = 0;i < sequence.length;i++){
            System.out.println(sequence[i]);
        }
        for (int i = 0;i < sequence.length;i++){
            sumSequence += sequence[i];
        }
        System.out.println("序列总和：" + sumSequence);
        boolean flag=false;
        for (int i = 0;i < sequence.length;i++) {
            // int转double，java会自动转换
            if (num == sequence[i]) {
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("序列中存在该数");
        }
        else {
            System.out.println("序列中不存在该数");
        }

    }
}

