package test;

import java.util.Scanner;

import java.util.Scanner;

class GameLevelUp {
    public static void main(String[] args) {
        System.out.println("青鸟游戏迷你平台>晋级");

        Scanner input = new Scanner(System.in);
        int highScoreCount = 0;  // 记录80分以上的局数
        int completedGames = 0;  // 记录完成的局数
        boolean quitEarly = false;  // 是否中途退出

        for (int i = 1; i <= 5; i++) {
            System.out.print("请输入第" + i + "局的成绩：");
            int score = input.nextInt();
            System.out.println("你正在玩第" + i + "局，成绩为：" + score);

            // 统计80分以上的局数
            if (score >= 80) {
                highScoreCount++;
            }
            completedGames++;

            // 如果是最后一局，不需要询问是否继续
            if (i == 5) {
                break;
            }

            System.out.print("继续玩下一局吗（yes/no）：");
            String choice = input.next();
            if ("yes".equals(choice)) {
                System.out.println("进入下一局");
                System.out.println();  // 空行分隔
            } else if ("no".equals(choice)) {
                System.out.println("您已中途退出游戏");
                quitEarly = true;
                break; // 退出循环，结束游戏
            } else {
                System.out.println("输入无效，请回答 yes 或 no");
            }
        }

        System.out.println();  // 输出空行
        System.out.println("总共完成了" + completedGames + "局");

        // 多重if判断晋级结果
        if (quitEarly) {
            System.out.println("对不起，您未能晋级，继续加油啊");
        } else if (highScoreCount >= 4) {
            System.out.println("一级");
        } else if (highScoreCount >= 3) {
            System.out.println("二级");
        } else {
            System.out.println("对不起，您未能晋级，继续加油啊");
        }

        input.close();
    }
}

