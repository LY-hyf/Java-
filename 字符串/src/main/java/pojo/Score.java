package pojo;

import java.util.HashMap;
import java.util.Map;

/**
 * 实体层：成绩实体，使用HashMap灵活存储课程名→成绩
 */
public class Score {
    private HashMap<String, Float> scores = new HashMap<>();

    public Score() {
    }

    /** 添加/修改一门课程的成绩 */
    public void addScore(String course, float score) {
        scores.put(course, score);
    }

    /** 获取某门课程的成绩 */
    public float getScore(String course) {
        return scores.getOrDefault(course, 0f);
    }

    /** 获取所有课程成绩的Map */
    public HashMap<String, Float> getScores() {
        return scores;
    }

    /** 计算平均分（不需要传参） */
    public float getAvg() {
        if (scores.isEmpty()) return 0;
        return getSum() / scores.size();
    }

    /** 计算总分 */
    public float getSum() {
        float sum = 0;
        for (float s : scores.values()) {
            sum += s;
        }
        return sum;
    }

    /** 获取课程数量 */
    public int getCount() {
        return scores.size();
    }
}
