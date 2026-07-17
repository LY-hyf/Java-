package org.example;

import java.util.*;

/**
 * ArrayList集合常见操作
 * @author hyf
 * @date 2026/6/4
 */
public class ArrayListOperations {
    public static void main(String[] args) {
        // 创建一个ArrayList集合（数据类型为String）
        List<String> list = new ArrayList<>();

        // 向集合添加5个元素
        list.add("苹果");
        list.add("香蕉");
        list.add("橙子");
        list.add("葡萄");
        list.add("西瓜");

        System.out.println("原始集合: " + list);

        // 常见操作
        // 1. 获取元素
        System.out.println("索引2的元素: " + list.get(2));

        // 2. 修改元素
        list.set(2, "芒果");
        System.out.println("修改后: " + list);

        // 3. 删除元素
        list.remove("香蕉");
        list.remove(0);
        System.out.println("删除后: " + list);

        // 4. 判断是否包含
        System.out.println("是否包含西瓜: " + list.contains("西瓜"));

        // 5. 获取大小
        System.out.println("集合大小: " + list.size());

        // 6. 遍历
        System.out.print("遍历结果: ");
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println();

        // 7. 排序
        Collections.sort(list);
        System.out.println("排序后: " + list);
    }
}