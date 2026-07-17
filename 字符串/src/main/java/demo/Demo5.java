package demo;

import pojo.CourseScore;

public class Demo5 {
    private static final CourseScore courseScore = new CourseScore();

    public static void print() {
        for (CourseScore cs : courseScore.getScores()) {
            System.out.println(cs.getCourse().concat(": ").concat(String.valueOf(cs.getScore())));
        }
    }

    public static void main(String[] args) {
        courseScore.addScore("SQL", 80f);
        courseScore.addScore("Java", 90f);
        courseScore.addScore("HTML", 86.7f);
        System.out.println("成绩单");
        print();
    }
}
