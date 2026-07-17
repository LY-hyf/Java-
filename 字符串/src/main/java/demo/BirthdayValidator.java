package demo;

import java.util.Scanner;

/**
 *生日校验：对录入的信息进行有效性验证，校验用户输入的生日
 */
public class BirthdayValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的生日（格式：yyyy-MM-dd）：");
        String birthday = scanner.nextLine();
        // 校验格式：长度应为10（yyyy-MM-dd）
        if (birthday.length() != 10) {
            System.out.println("日期格式错误，请输入正确的格式 yyyy-MM-dd！");
            scanner.close();
            return;
        }
        // 校验分隔符
        if (birthday.charAt(4) != '-' || birthday.charAt(7) != '-') {
            System.out.println("日期格式错误，请使用\"-\"作为分隔符！");
            scanner.close();
            return;
        }
        // 提取年、月、日
        String yearStr = birthday.substring(0, 4);
        String monthStr = birthday.substring(5, 7);
        String dayStr = birthday.substring(8, 10);
        try {
            int year = Integer.parseInt(yearStr);
            int month = Integer.parseInt(monthStr);
            int day = Integer.parseInt(dayStr);
            // 校验年：合理范围 1900-2099
            if (year < 1900 || year > 2099) {
                System.out.println("年份不合理，请输入1900-2099之间的年份！");
                scanner.close();
                return;
            }
            // 校验月：1-12
            if (month < 1 || month > 12) {
                System.out.println("月份不合理，请输入1-12之间的月份！");
                scanner.close();
                return;
            }
            // 校验日：根据月份判断天数
            int maxDays;
            switch (month) {
                case 2:
                    // 判断闰年
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        maxDays = 29;
                    } else {
                        maxDays = 28;
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    maxDays = 30;
                    break;
                default:
                    maxDays = 31;
            }
            if (day < 1 || day > maxDays) {
                System.out.println("日期不合理，该月只有1-" + maxDays + "日！");
                scanner.close();
                return;
            }
            System.out.println("生日校验通过！您的生日是：" + year + "年" + month + "月" + day + "日");
        } catch (NumberFormatException e) {
            System.out.println("日期格式错误，请确保年月日均为数字！");
        }
        scanner.close();
    }
}
