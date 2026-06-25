package test;

import java.util.Scanner;
public class GameChoice {
    public static void main(String[] args){
        System.out.println("欢迎进入青鸟游戏迷你平台\t");

        System.out.println("请选择您喜欢的游戏:\t");

        System.out.println("*************************************");
        System.out.println("1. 斗地主\t2. 斗牛\t3. 泡泡龙\t4. 连连看\t");
        System.out.println("*************************************");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("您已进入斗地主房间");
                break;
            case 2:
                System.out.println("您已进入斗牛房间");
                break;
            case 3:
                System.out.println("您已进入泡泡龙房间");
                break;
            case 4:
                System.out.println("您已进入连连看房间");
                break;
            default:
                System.out.println("输入错误，请重新输入");
        }
    }


}
