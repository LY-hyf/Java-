package org.example;

import java.util.*;
/**
 * 使用HashSet存储学生信息,并实现重写equals和hashCode方法，示例类
 * @author hyf
 * @date 2026/6/4
 */
public class HashSetStudent {
    private int id;
    private String name;

    public HashSetStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // HashSet需要重写equals和hashCode
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        HashSetStudent student = (HashSetStudent) obj;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return id + ":" + name;
    }

    public static void main(String[] args) {
        System.out.println("=== HashMap操作 ===");
        Map<String, String> hashMap = new HashMap<>();

        // 添加
        hashMap.put("1001", "欧欧");
        hashMap.put("1002", "亚亚");
        hashMap.put("1003", "菲菲");
        hashMap.put("1004", "美美");
        hashMap.put("1005", "西西");
        hashMap.putIfAbsent("1001", "美美");  // 键存在时不添加

        // 删除
        hashMap.remove("1003");
        hashMap.remove("1002", "亚亚");  // 键值匹配才删除

        // 修改
        hashMap.replace("1001", "新欧欧");
        hashMap.put("1001", "欧欧");  // put也可以修改

        // 查询
        String name = hashMap.get("1001");
        String defaultName = hashMap.getOrDefault("1004", "未知");

        // 遍历
        System.out.println("HashMap遍历:");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("  键: " + entry.getKey() + ", 值: " + entry.getValue());
        }
    }
}
