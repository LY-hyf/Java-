package org.example;

import java.util.*;

public class GenericListExample {
    public static void main(String[] args) {
        // 声明和创建
        List<String> strList = new ArrayList<>();      // 存储String
//        List<Integer> intList = new ArrayList<>();     // 存储Integer
//        List<Dog> dogList = new ArrayList<>();         // 存储自定义对象

        // 添加元素
        strList.add("苹果");
        strList.add("香蕉");
        // strList.add(123);  // 编译错误

        // 获取元素（无需强制转换）
        String fruit = strList.get(0);

        // 遍历
        for (String s : strList) {
            System.out.println(s);
        }

        // 实用示例：存储学生成绩
        List<Integer> scores = new ArrayList<>();
        scores.add(85);
        scores.add(92);
        scores.add(78);

        // 计算平均分
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        System.out.println("平均分: " + sum / scores.size());
    }
}
