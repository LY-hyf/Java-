package polymorphism;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 主人类,定义领养，喂食，游玩方法
 * @author hyf
 * @date 2026/6/1
 */
public class Master {
    private String name;
    private ArrayList<String> myPets = new ArrayList<>();

    public Master(String name){
        this.name = name;
        myPets.add("猫");  // 初始有一只猫
    }
    Scanner input = new Scanner(System.in);

    //实现领养宠物并添加到宠物家园
    public void adoptPet(){
        System.out.println("欢迎来到宠物商店");
        PetStore petStore = new PetStore();
        String sellResult = petStore.sellPet();
        myPets.add(sellResult);
        System.out.println("已添加到你的宠物家园，你现在有" + myPets.size() + "只宠物" + "\n");
    }

    //实现喂食宠物
    public void feed(){
        Cat cat = new Cat();
        System.out.println("主人给" + cat.getName() + "吃东西");
        cat.eat();
    }

    //实现和宠物玩耍
    public void play(){
        for(int i = 0; i < myPets.size(); i++){
            System.out.println((i+1) + "." + myPets.get(i));
        }
        System.out.print("请选择和哪个宠物玩耍：");
        int type = input.nextInt();
        System.out.println("你选择了和" + myPets.get(type - 1) + "玩耍" + "\n");
        Pet pet = new Pet();
        pet.play();
    }

    public static void main(String[] args){
        Master master = new Master("张三");
        master.adoptPet();
        master.play();
    }
}
