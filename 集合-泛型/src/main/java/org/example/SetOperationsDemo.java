package org.example;

import java.util.*;

/**
 * Set常用操作
 * @author hyf
 * @date 2026/6/5
 */
public class SetOperationsDemo {

    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        // 1. 添加元素
        fruits.add("苹果");
        fruits.add("香蕉");
        fruits.add("橙子");
        System.out.println("添加后: " + fruits);

        // 2. 添加重复元素 - 返回 false
        boolean added = fruits.add("苹果");
        System.out.println("添加重复元素'苹果'成功吗？ " + added);

        // 3. 删除元素
        fruits.remove("香蕉");
        System.out.println("删除香蕉后: " + fruits);

        // 4. 检查是否包含某个元素
        boolean hasOrange = fruits.contains("橙子");
        System.out.println("是否包含橙子？ " + hasOrange);

        // 5. 获取大小
        System.out.println("集合大小: " + fruits.size());

        // 6. 判断是否为空
        System.out.println("是否为空？ " + fruits.isEmpty());

        // 7. 遍历 Set
        System.out.print("遍历元素: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 8. 清空集合
        fruits.clear();
        System.out.println("清空后: " + fruits);
    }
}
