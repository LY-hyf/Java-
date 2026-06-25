package array;

import java.util.HashMap;
import java.util.Map;

public class ForEachMap {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("语文", 90);
        scores.put("数学", 85);
        scores.put("英语", 88);

        // 方式1：遍历 Entry（推荐）
        System.out.println("遍历 Entry 集合：");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + "：" + entry.getValue());
        }

        // 方式2：遍历 Key
        System.out.println("\n遍历 Key 集合：");
        for (String key : scores.keySet()) {
            System.out.println(key + "：" + scores.get(key));
        }

        // 方式3：遍历 Value
        System.out.println("\n遍历 Value 集合：");
        for (int value : scores.values()) {
            System.out.println(value);
        }
    }
}
