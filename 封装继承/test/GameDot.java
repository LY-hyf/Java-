package test;

import java.util.Scanner;

class GameDot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("青鸟迷你游戏平台 > 游戏点击率");

        int countAbove100 = 0;  // 点击率大于100的游戏数量
        int totalGames = 4;      // 总共4个游戏

        for (int i = 1; i <= totalGames; i++) {
            System.out.print("请输入第" + i + "个游戏的点击率：");
            int clickRate = input.nextInt();

            // 使用if结构、continue语句统计点击率100以上的游戏数量
            if (clickRate <= 100) {
                continue;  // 不大于100，跳过本次统计
            }
            countAbove100++;
        }

        double proportion = (double) countAbove100 / totalGames * 100;

        System.out.println("点击率大于100的游戏数量：" + countAbove100);
        System.out.println("点击率大于100的游戏所占的比例为：" + proportion + "%");

        input.close();
    }
}