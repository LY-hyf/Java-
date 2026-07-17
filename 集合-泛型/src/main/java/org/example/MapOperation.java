package org.example;

import java.util.*;

/**
 * map集合操作
 * @author hyf
 * @date 2026/6/4
 */
public class MapOperation {
    public static void main(String[] args) {
        // 创建Map集合
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");

        // 1. 遍历集合，并将序号与对应人名打印
        System.out.println("原始Map集合");
        // 方式1：使用entrySet遍历,entrySet是Set集合，里面存放的是Map.Entry示例对象,Map.Entry对象中存放的是键值对,
        System.out.println("方式1(entrySet):");
//        for(Map.Entry<Integer, String> entry : map.entrySet()){
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("编号: " + entry.getKey() + ", 姓名: " + entry.getValue());
        }

        // 方式2：使用keySet集遍历
        System.out.println("\n方式2(keySet):");
//        for(Integer key : map.keySet()){
//            System.out.println(key + map.get(key));
//        }
        for (Integer key : map.keySet()) {
            System.out.println("编号: " + key + ", 姓名: " + map.get(key));
        }

        // 方式3：使用Iterator遍历
        System.out.println("\n方式3(Iterator):");
        // 获取迭代器对象
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println("编号: " + entry.getKey() + ", 姓名: " + entry.getValue());
        }

        // 2. 向该map集合中插入一个编码为5姓名为郭靖的信息
        System.out.println("\n插入编号5:郭靖");
        map.put(5, "郭靖");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("编号: " + entry.getKey() + ", 姓名: " + entry.getValue());
        }

        // 3. 移除该map中的编号为1的信息
        System.out.println("\n移除编号1");
        map.remove(1);
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("编号: " + entry.getKey() + ", 姓名: " + entry.getValue());
        }

        // 4. 将map集合中编号为2的姓名信息修改为"周林"
        System.out.println("\n修改编号2为周林");
        map.put(2, "周林");  // 方式1：使用put覆盖
        // map.replace(2, "周林");  // 方式2：使用replace方法

        // 打印最终结果
        System.out.println("\n最终结果");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("编号: " + entry.getKey() + ", 姓名: " + entry.getValue());
        }
    }
}