package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDog {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("欧欧\t雪纳瑞");
        list.add("亚亚\t拉布拉多");
        list.add("菲菲\t拉布拉多");
        list.add("美美\t雪纳瑞");
        System.out.println("共计有" + list.size() + "条狗");
        System.out.println("分别是：");
        System.out.println(list);
        for(String s : list){
            System.out.println(s);
        }
        System.out.println("------------------------");

        System.out.println("删除前有" + list.size() + "条狗");
        list.remove(0);
        list.remove("亚亚\t拉布拉多");
        System.out.println("删除后有" + list.size() + "条狗");
        System.out.println("分别是：");
        for(String s : list){
            System.out.println(s);
        }
        if (list.contains("美美\t雪纳瑞")){
            System.out.println("集合中包含美美的信息");
        }
    }
}
