package org.example;

import java.util.*;

/**
 * 省份-省会映射,将两个数组以映射关系使用HashMap存储
 * @author hyf
 * @date 2026/6/4
 */
public class ProvinceCapitalMap {
    public static void main(String[] args) {
        // 两个数组
        String[] provinces = {"黑龙江省", "浙江省", "江西省", "广东省", "福建省"};
        String[] capitals = {"哈尔滨", "杭州", "南昌", "广州", "福州"};

        // 将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < provinces.length; i++) {
            map.put(provinces[i], capitals[i]);
        }

        // 输出结果
        System.out.println("=== 省份-省会映射 ===");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // 使用LinkedHashMap保持插入顺序
        System.out.println("\n=== 使用LinkedHashMap保持顺序 ===");
        Map<String, String> linkedMap = new LinkedHashMap<>();
        for (int i = 0; i < provinces.length; i++) {
            linkedMap.put(provinces[i], capitals[i]);
        }
        for (Map.Entry<String, String> entry : linkedMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
