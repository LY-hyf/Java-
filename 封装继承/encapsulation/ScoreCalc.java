package encapsulation;

import java.util.Scanner;

/**
 * 成绩计算类
 * @author hyf
 * @date 2025/5/30
 */
public class ScoreCalc {
    double chinese;
    double math;
    double english;
    // 输入成绩
    public void inputScore() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入语文成绩：");
        chinese = sc.nextDouble();
        System.out.print("请输入数学成绩：");
        math = sc.nextDouble();
        System.out.print("请输入英语成绩：");
        english = sc.nextDouble();
        sc.close();
    }
    // 计算总成绩
    public double getTotal() {
        return chinese + math + english;
    }
    // 计算平均分
    public double getAverage() {
        return getTotal() / 3;
    }
    // 显示结果
    public void showResult() {
        System.out.println("语文：" + chinese + "分");
        System.out.println("数学：" + math + "分");
        System.out.println("英语：" + english + "分");
        System.out.println("总成绩：" + getTotal() + "分");
        System.out.println("平均分：" + getAverage() + "分");
    }
}
