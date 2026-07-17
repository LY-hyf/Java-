package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPenguin {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("欧欧\tQ仔");
        list.add("亚亚\tQ仔");
        list.add("菲菲\tQ妹");
        list.add("美美\tQ妹");
        System.out.println("共计有" + list.size() + "只企鹅");
        System.out.println("分别是：");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("------------------------");
        list.remove(2); // 删除 "菲菲\tQ妹"
        list.remove(2); // "美美\tQ妹" 现在位于索引 2
        System.out.println("删除后有" + list.size() + "企鹅");
        System.out.println("分别是：");
        for(String s : list){
            System.out.println(s);
        }
        if (!list.contains("美美\tQ妹")){
            System.out.println("集合中不包含美美的信息");
        }
    }
}

