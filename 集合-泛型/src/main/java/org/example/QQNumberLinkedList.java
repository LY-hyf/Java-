package org.example;

import java.util.*;

/**
 * 将一批QQ号码存放在LinkedList中，并去除重复元素,迭代器打印
 * @author hyf
 * @date 2026/6/4
 */
public class QQNumberLinkedList {
    public static void main(String[] args) {
        // 已知数组存放一批QQ号码
        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};

        // 1. 将数组里面的所有qq号都存放在LinkedList中
        LinkedList<String> qqList = new LinkedList<>();
//        for(int i = 0; i < strs.length; i++){
//            qqList.add(strs[i]);
//        }
        for (String qq : strs) {
            qqList.add(qq);
        }

        System.out.println("原始LinkedList（含重复）: " + qqList);
        System.out.println("原始个数: " + qqList.size());

        // 2. 将list中重复元素删除（使用LinkedHashSet去重，保持顺序）,创建对象调用
        LinkedHashSet<String> uniqueSet = new LinkedHashSet<>(qqList);
        qqList.clear();
        qqList.addAll(uniqueSet);

        System.out.println("\n去重后LinkedList: " + qqList);
        System.out.println("去重后个数: " + qqList.size());

        // 3. 使用迭代器打印
        System.out.println("\n=== 使用迭代器遍历 ===");
        // 3.1 获取迭代器对象,实例对象为qqList
        Iterator<String> it = qqList.iterator();
        while (it.hasNext()) {
            String qq = it.next();
            System.out.println("QQ号码: " + qq + " (长度: " + qq.length() + "位)");
        }

        // 4. 使用增强for循环打印
        System.out.println("\n=== 使用增强for循环遍历 ===");
        for (String qq : qqList) {
            System.out.println("QQ号码: " + qq + " (长度: " + qq.length() + "位)");
        }
    }
}