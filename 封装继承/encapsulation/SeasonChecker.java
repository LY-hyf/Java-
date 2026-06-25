package encapsulation;

import java.util.Scanner;

/**
 * 季节判断类
 * 根据输入的月份判断所属季节
 * @author hyf
 * @date 2025/5/30
 */
public class SeasonChecker {

    /**
     * 根据月份判断季节
     * @param month 月份（1-12）
     * @return 季节名称
     */
    public String getSeason(int month) {
        if (month >= 3 && month <= 5) {
            return "春季";
        } else if (month >= 6 && month <= 8) {
            return "夏季";
        } else if (month >= 9 && month <= 11) {
            return "秋季";
        } else if (month == 12 || month == 1 || month == 2) {
            return "冬季";
        } else {
            return "输入错误";
        }
    }

    /**
     * 测试方法
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SeasonChecker checker = new SeasonChecker();

        System.out.print("请输入月份（1-12）：");
        int month = sc.nextInt();

        String season = checker.getSeason(month);

        if (season.equals("输入错误")) {
            System.out.println("输入错误，请输入1-12之间的数字！");
        } else {
            System.out.println(month + "月是" + season);
        }

        sc.close();
    }
}
