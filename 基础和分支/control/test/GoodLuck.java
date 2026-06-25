package control.test;

import java.util.Scanner;

public class GoodLuck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("我行我素购物管理系统 > 幸运抽奖");
        System.out.print("请输入4位会员号：");
        int cardNo = input.nextInt();

        // 获取会员号的百位数字
        int hundred = cardNo / 100 % 10;

        // 生成随机数字（0-9）
        int randomNum = (int)(Math.random() * 10);

        System.out.println("幸运数字是：" + randomNum);

        // 判断是否中奖
        if (hundred == randomNum) {
            System.out.println(cardNo + "号客户是幸运客户，获得奖品MP3一个。");
        } else {
            System.out.println(cardNo + "号客户，谢谢您的支持！");
        }

        input.close();
    }
}
