package demo;

import java.util.Scanner;

public class MemberRegister {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***欢迎进入注册系统***");
        System.out.println();
        boolean isValidIdCard = false;
        boolean isValidPhone = false;
        boolean isValidTel = false;
        while (true) {
            System.out.print("请输入身份证号：");
            String idCard = scanner.nextLine();
            if (idCard.length() == 16 || idCard.length() == 18) {
                isValidIdCard = true;
            } else {
                System.out.println("身份证号必须是16位或18位！");
                continue;
            }
            System.out.print("请输入手机号：");
            String phone = scanner.nextLine();
            if (phone.length() == 11) {
                isValidPhone = true;
            } else {
                System.out.println("手机号码必须是11位！");
                continue;
            }
            System.out.print("请输入座机号：");
            String tel = scanner.nextLine();
            if (tel.contains("-")) {
                String[] parts = tel.split("-");
                if (parts.length == 2 && parts[0].length() == 4 && parts[1].length() == 7) {
                    isValidTel = true;
                } else {
                    System.out.println("座机号码区号必须为4位，电话号码必须是7位！");
                    continue;
                }
            } else {
                System.out.println("座机号码格式错误，必须包含'-'！");
                continue;
            }
            if (isValidIdCard && isValidPhone && isValidTel) {
                System.out.println("注册成功！");
                break;
            }
        }
        scanner.close();
    }
}
