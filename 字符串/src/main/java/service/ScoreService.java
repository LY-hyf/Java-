package service;

import pojo.Score;

import java.util.Map;

/**
 * 业务层：成绩单业务逻辑，处理成绩计算与格式化输出
 */
public class ScoreService {

    /**
     * 打印成绩单
     */
    public void printReport(Score score) {
        if (score == null || score.getCount() == 0) {
            System.out.println("成绩数据为空！");
            return;
        }

        System.out.println("\n========== 成绩单 ==========");
        for (Map.Entry<String, Float> entry : score.getScores().entrySet()) {
            String line = entry.getKey().concat(": ").concat(String.valueOf(entry.getValue()));
            System.out.println(line);
        }
        System.out.println("总分：" + score.getSum() + "  平均分：" + score.getAvg());
        System.out.println("==============================");
    }

    /**
     * 校验成绩是否有效（0-100 之间）
     */
    public boolean validate(Score score) {
        for (float s : score.getScores().values()) {
            if (s < 0 || s > 100) {
                return false;
            }
        }
        return true;
    }

    /**
     * 根据平均分评定等级
     */
    public String getGrade(Score score) {
        float avg = score.getAvg();
        if (avg >= 90) {
            return "优秀";
        } else if (avg >= 80) {
            return "良好";
        } else if (avg >= 70) {
            return "中等";
        } else if (avg >= 60) {
            return "及格";
        } else {
            return "不及格";
        }
    }
}
