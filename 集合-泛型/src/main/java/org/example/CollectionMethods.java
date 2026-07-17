package org.example;

/**
 * 集合常用方法
 * @author hyf
 * @date 2026/6/4
 */
import java.util.*;
public class CollectionMethods {
    public static void main(String[] args) {
        //  List常用方法
        System.out.println("List常用方法");
        List<String> list = new ArrayList<>();

        // 添加元素
        list.add("苹果");           // 尾部添加
        list.add(0, "香蕉");        // 指定位置添加
        list.addAll(2, Arrays.asList("橙子", "葡萄")); // 指定位置插入集合

        // 获取元素
        String fruit = list.get(0);  // 获取指定位置
        int size = list.size();       // 获取大小

        // 修改元素
        list.set(1, "西瓜");          // 修改指定位置

        // 删除元素
        list.remove(0);               // 按索引删除
        list.remove("橙子");          // 按对象删除

        // 查找
        boolean contains = list.contains("西瓜");
        int index = list.indexOf("葡萄");

        // 遍历
        System.out.println("List元素: " + list);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            fruit = iterator.next();
            System.out.println(fruit);
        }

        //  Set常用方法
        System.out.println("\nSet常用方法");
        Set<String> set = new HashSet<>();

        // 添加元素（自动去重）
        set.add("张三");
        set.add("李四");
        set.add("张三");  // 重复，不会添加

        // 删除
        set.remove("李四");

        // 判断
        boolean hasZhang = set.contains("张三");
        boolean isEmpty = set.isEmpty();

        System.out.println("Set元素: " + set);

        // Map常用方法
        System.out.println("\nMap常用方法");
        Map<String, Integer> map = new HashMap<>();

        // 添加/修改
        map.put("语文", 90);
        map.put("数学", 85);
        map.put("英语", 88);
        map.putIfAbsent("语文", 95);  // 不存在才添加

        // 获取
        Integer chinese = map.get("语文");
        Integer physics = map.getOrDefault("物理", 0);  // 不存在返回默认值

        // 删除
        map.remove("英语");
        map.remove("数学", 85);  // 键值对匹配才删除

        // 替换
        map.replace("语文", 92);
        map.replace("数学", 85, 90);  // 条件替换

        // 获取所有键/值
        Set<String> keys = map.keySet();
        Collection<Integer> values = map.values();

        // 判断
        boolean hasKey = map.containsKey("语文");
        boolean hasValue = map.containsValue(90);

        System.out.println("Map元素: " + map);
    }
}
