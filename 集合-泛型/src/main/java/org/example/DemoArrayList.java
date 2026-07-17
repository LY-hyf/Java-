package org.example;

/**
 * 将数组中>10的元素取出来使用ArrayList存储，并遍历ArrayList
 * @author hyf
 * @date 2026/6/5
 */
import java.util.ArrayList;
import java.util.List;
public class DemoArrayList {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random()*100);
            System.out.println(arr[i]);
        }
        System.out.println("-----------------");
        // 将数组中的元素取出来使用ArrayList存储，并遍历ArrayList
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i]>10){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
