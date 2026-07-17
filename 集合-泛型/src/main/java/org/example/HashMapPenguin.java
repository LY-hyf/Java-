package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapPenguin {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("欧欧","Q仔");
        map.put("亚亚","Q仔");
        map.put("娜娜","Q妹");
        map.put("美美","Q妹");
        System.out.println("共计有" + map.size() + "只企鹅");

        System.out.println("使用Iterator遍历，所有企鹅的品种和昵称分别是：");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        map.replace("娜娜","QQ仔");
        System.out.println("使用增强for循环遍历，所有企鹅的品种和昵称分别是：");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }



//        System.out.println("------------------------");
//        map.remove("欧欧");
//        map.remove("亚亚");
//        System.out.println("删除后有" + map.size() + "企鹅");
//
//        if (map.containsKey("美美")){
//            System.out.println("集合中包含美美的信息");
//        }

    }
}
