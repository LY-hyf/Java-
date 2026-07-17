package demo;

import java.util.HashMap;

public class Demo4 {
    static HashMap<String, Float> scores = new HashMap<>();
    public static void print(){
        StringBuilder sb = new StringBuilder("{");
        for (String course : scores.keySet()) {
            String entry = course.concat("=").concat(String.valueOf(scores.get(course))).concat(", ");
            sb.append(entry);
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("}");
        System.out.println(sb);
    }

    public static void main(String[] args) {
        scores.put("SQL", 80f);
        scores.put("Java", 90f);
        scores.put("HTML", 86.7f);
        print();
    }
}
