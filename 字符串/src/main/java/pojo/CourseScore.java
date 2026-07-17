package pojo;
import java.util.ArrayList;
import java.util.List;

public class CourseScore {
    private static List<CourseScore> scores = new ArrayList<>();
    private String course;
    private float score;

    public CourseScore() {
    }

    public CourseScore(String course, float score) {
        this.course = course;
        this.score = score;
    }

    public void addScore(String course, float score) {
        CourseScore cs = new CourseScore();
        cs.setCourse(course);
        cs.setScore(score);
        scores.add(cs);
    }

    public List<CourseScore> getScores() {
        return scores;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
