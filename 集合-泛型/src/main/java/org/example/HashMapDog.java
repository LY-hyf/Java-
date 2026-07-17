package org.example;

import java.util.HashMap;

public class HashMapDog {
    public static void main(String[] args){
        HashMap<String,String> map = new HashMap<>();
        map.put("欧欧","雪纳瑞");
        map.put("娜娜","拉布拉多");
        map.put("菲菲","拉布拉多");
        map.put("美美","雪纳瑞");
        System.out.println("共计有" + map.size() + "条狗");
        System.out.println("分别是：");
        System.out.println(map);

        System.out.println("------------------------");

        System.out.println("删除前有" + map.size() + "条狗");
        map.remove(0);
        map.remove("亚亚","拉布拉多");
        System.out.println("删除后有" + map.size() + "条狗");
        System.out.println("分别是：");
        System.out.println(map.keySet());
        System.out.println(map.get("欧欧"));
        if (map.containsKey("欧欧")){
            System.out.println("Map中存在指定对象，信息如下");
            System.out.println("欧欧" + "\t" + map.get("欧欧"));
        }
        else {
            System.out.println("Map中不存在指定对象");
        }
    }
}
