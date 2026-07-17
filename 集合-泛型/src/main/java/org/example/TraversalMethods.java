package org.example;

import java.util.*;

/**
 * 遍历数组，集合的方法
 * @author hyf
 * @date 2026/6/4
 */
public class TraversalMethods {
    public static void main(String[] args) {
        // 数组遍历
        System.out.println("数组遍历");
        String[] array = {"A", "B", "C", "D"};

        // 普通打印
        System.out.println(array);
        // 方式1：普通for循环
        System.out.print("普通for循环: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // 方式2：增强for循环
        System.out.print("增强for循环: ");
        for (String item : array) {
            System.out.print(item + " ");
        }
        System.out.println("\n");

        // 集合遍历（至少两种）
        System.out.println("List集合遍历");
        List<String> list = new ArrayList<>(Arrays.asList("欧欧", "亚亚", "菲菲", "美美"));

        // 普通打印
        System.out.println(list);
        // 方式1：增强for循环
        System.out.print("方式1(增强for): ");
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println();

        // 方式2：Iterator迭代器
        System.out.print("方式2(Iterator): ");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 方式3：普通for循环（List特有）
        System.out.print("方式3(普通for): ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // 方式4：forEach + Lambda（Java 8）
        System.out.print("方式4(Lambda): ");
        list.forEach(item -> System.out.print(item + " "));
        System.out.println("\n");

        // Set集合遍历
        System.out.println("Set集合遍历");
        Set<String> set = new HashSet<>(Arrays.asList("苹果", "香蕉", "橙子"));

        // 方式1：增强for
        System.out.print("增强for: ");
        for (String item : set) {
            System.out.print(item + " ");
        }
        System.out.println();

        // 方式2：Iterator
        System.out.print("Iterator: ");
        Iterator<String> setIt = set.iterator();
        while (setIt.hasNext()) {
            System.out.print(setIt.next() + " ");
        }
        System.out.println("\n");

        // Map集合遍历
        System.out.println("Map集合遍历");
        Map<String, String> map = new HashMap<>();
        map.put("1001", "欧欧");
        map.put("1002", "亚亚");
        map.put("1003", "菲菲");

        // 方式1：遍历entrySet
        System.out.println("方式1(entrySet):");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("  " + entry.getKey() + "=" + entry.getValue());
        }

        // 方式2：遍历keySet
        System.out.println("方式2(keySet):");
        for (String key : map.keySet()) {
            System.out.println("  " + key + "=" + map.get(key));
        }

        // 方式3：Iterator遍历entrySet
        System.out.println("方式3(Iterator+entrySet):");
        Iterator<Map.Entry<String, String>> mapIt = map.entrySet().iterator();
        while (mapIt.hasNext()) {
            Map.Entry<String, String> entry = mapIt.next();
            System.out.println("  " + entry.getKey() + "=" + entry.getValue());
        }

        // 方式4：forEach + Lambda
        System.out.println("方式4(Lambda):");
        map.forEach((key, value) -> System.out.println("  " + key + "=" + value));
    }
}

