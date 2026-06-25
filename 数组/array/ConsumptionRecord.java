package array;

/**
 * 消费记录输入与输出
 * @author 韩永发
 * @date 2026/5/28
 * @version 1.0
 * @param consumptionCount 消费次数
 * @param consumption 消费金额数组
 * @param sumConsumption 消费总金额
 * return 消费记录
 */
import java.util.Scanner;
public class ConsumptionRecord {
    public static void main(String[] args) {
        System.out.println("请输入会员的消费记录：");
        int consumptionCount = 5;
        double[] consumption = new double[consumptionCount];
        for (int i = 0; i < consumption.length; i++){
            Scanner input = new Scanner(System.in);
            System.out.print("请输入第" + (i + 1) + "次消费金额：");
            consumption[i] = input.nextDouble();
        }
        System.out.println("序号\t消费金额");
        for (int i = 0; i < consumption.length; i++){
            System.out.println((i + 1) + "\t" + consumption[i]);
        }
        double sumConsumption = 0;
        for (int i = 0; i < consumption.length; i++){
            sumConsumption += consumption[i];
        }
        System.out.println("消费总金额：" + sumConsumption);

    }
}
