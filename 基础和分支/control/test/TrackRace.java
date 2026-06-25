package control.test;

import java.util.Scanner;

public class TrackRace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入百米赛跑成绩（秒）：");
        double time = input.nextDouble();

        if (time < 10) {
            System.out.println("恭喜！进入决赛！");
            System.out.print("请输入性别（男/女）：");
            String gender = input.next();

            if (gender.equals("男")) {
                System.out.println("进入男子组");
            } else if (gender.equals("女")) {
                System.out.println("进入女子组");
            } else {
                System.out.println("性别输入有误");
            }
        } else {
            System.out.println("遗憾，未进入决赛");
        }

        input.close();
    }
}
