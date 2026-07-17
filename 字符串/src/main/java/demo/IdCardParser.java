package demo;

import java.util.Scanner;

/**
 * 身份证号码校验：输入身份证号码，校验格式并提取出生年月日
 */
public class IdCardParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入身份证号码：");
        String idCard = scanner.nextLine();
        if (idCard.length() != 16 && idCard.length() != 18) {
            System.out.println("身份证号码格式错误！必须是16位或18位。");
            scanner.close();
            return;
        }
        String year, month, day;
        if (idCard.length() == 18) {
            year = idCard.substring(6, 10);
            month = idCard.substring(10, 12);
            day = idCard.substring(12, 14);
        } else {
            year = "19" + idCard.substring(6, 8);
            month = idCard.substring(8, 10);
            day = idCard.substring(10, 12);
        }
        System.out.println("校验通过！");
        System.out.println("出生年月日：" + year + "年" + month + "月" + day + "日");
        scanner.close();
    }
}
