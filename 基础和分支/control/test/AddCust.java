package control.test;

import java.util.Scanner;

public class AddCust {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("我行我素购物管理系统 > 客户信息管理 > 添加客户信息\n");

        System.out.print("请输入会员号（0000-9999）：");
        int memberId = input.nextInt();

        // 合法性校验：0 ~ 9999
        if (memberId < 0 || memberId > 9999) {
            System.out.println("会员号不合法！请输入0000~9999之间的整数。");
            return;
        }

        System.out.print("请输入会员生日（月/日<用两位表示>）：");
        String birthday = input.next();

        System.out.print("请输入积分：");
        int points = input.nextInt();

        System.out.println("\n已录入的会员信息：");
        // 按4位格式输出（补前导零）
        System.out.printf("%04d %s %d\n", memberId, birthday, points);

        input.close();
    }
}