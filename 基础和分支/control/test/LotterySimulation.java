package control.test;

import java.util.Random;
import java.util.Scanner;

public class LotterySimulation {
        public static void main(String[] args) {
            Random random = new Random();

            // 模拟是否中奖（true = 中500万，false = 没中）
            boolean win = random.nextBoolean();

            if (win) {
                System.out.println("🎉 体彩中了500万！🎉");
                System.out.println("计划：");
                System.out.println("1. 买车");
                System.out.println("2. 资助希望工程");
                System.out.println("3. 去欧洲旅游");
            } else {
                System.out.println("😭 没中奖...");
                System.out.println("计划：");
                System.out.println("1. 买下一期体彩");
                System.out.println("2. 继续烧高香");
            }
        }
    }


