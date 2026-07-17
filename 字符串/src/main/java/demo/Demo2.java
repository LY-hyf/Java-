package demo;

import service.Service02;

import java.util.Scanner;

public class Demo2 {
    private static final Service02 service02 = new Service02();

    public static void verify(Scanner input){
        boolean flag = true;
        do {
            System.out.println("请输入用户名：");
            String username = input.nextLine();
            System.out.println("请输入密码：");
            String password = input.nextLine();
            System.out.println("请确认密码：");
            String confirmPwd = input.nextLine();
            flag = service02.register(username, password, confirmPwd);
        } while (!flag);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        verify(input);
        input.close();
    }
}
