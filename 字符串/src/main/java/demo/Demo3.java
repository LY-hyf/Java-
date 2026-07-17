package demo;

import pojo.Score;
import service.ScoreService;

/**
 * 表现层：成绩单展示程序
 * 使用三层架构（表现层-业务层-实体层）实现成绩单打印
 */
public class Demo3 {

    private static final ScoreService scoreService = new ScoreService();

    public static void main(String[] args) {
        // 1. 实体层：构建成绩数据
        Score score = new Score();
        score.addScore("SQL", 80);
        score.addScore("Java", 90);
        score.addScore("HTML", 86.7f);

        // 2. 业务层：校验并生成成绩单
        if (scoreService.validate(score)) {
            scoreService.printReport(score);
            System.out.println("综合评定：" + scoreService.getGrade(score));
        } else {
            System.out.println("成绩数据异常，请检查！");
        }
    }
}
