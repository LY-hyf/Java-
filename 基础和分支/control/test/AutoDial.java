package control.test;

import java.util.Scanner;

public class AutoDial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入按键（1-4）：");
        int key = input.nextInt();

        switch (key) {
            case 1:
                System.out.println("拨爸爸的号");
                break;
            case 2:
                System.out.println("拨妈妈的号");
                break;
            case 3:
                System.out.println("拨爷爷的号");
                break;
            case 4:
                System.out.println("拨奶奶的号");
                break;
            default:
                System.out.println("按键无效");
                break;
        }
        input.close();
    }
}