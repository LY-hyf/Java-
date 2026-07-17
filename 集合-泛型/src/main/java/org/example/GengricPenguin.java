package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GengricPenguin {
    public static void main(String[] args) {
        Map<Integer, Penguin> map = new HashMap<>();
        map.put(1, new Penguin("欧欧", "Q仔"));
        map.put(2, new Penguin("亚亚", "Q仔"));
        map.put(3, new Penguin("娜娜", "Q妹"));
        map.put(4, new Penguin("美美", "Q妹"));
        System.out.println("共计有" + map.size() + "只企鹅");

        System.out.println("------------------------");
//        map.remove(1); // 欧欧
//        map.remove(2); // 亚亚
//        System.out.println("删除后有" + map.size() + "只企鹅");
//
//        if (map.containsKey(4)) {
//            System.out.println("集合中包含美美的信息");
//        }

        System.out.println("使用Iterator遍历，所有企鹅的品种和昵称分别是：");
        Iterator<Map.Entry<Integer, Penguin>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Penguin> entry = iterator.next();
            System.out.println(entry.getValue().getName() + "\t" + entry.getValue().getBreed());
        }
    }
}
