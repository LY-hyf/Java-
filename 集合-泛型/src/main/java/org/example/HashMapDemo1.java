package org.example;

import java.util.Map;
import java.util.HashMap;

public class HashMapDemo1 {
    public static void main(String[] args){
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("CN", "中华人民共和国");
        hashMap.put("US", "美国");
        hashMap.put("FR", "法国");
        hashMap.put("RU", "俄罗斯联邦");

        System.out.println("CN对应的国家是" + hashMap.get("CN"));
        System.out.println("Map集合中共有" + hashMap.size() + "组数据");
        if (hashMap.containsKey("FR")){
            System.out.println("Map集合中包含FR的key吗? true");
        }
        hashMap.remove("FR");
        if (!hashMap.containsKey("FR")){
            System.out.println("Map集合中包含FR的key吗? false");
        }
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println(hashMap.entrySet());
    }
}
