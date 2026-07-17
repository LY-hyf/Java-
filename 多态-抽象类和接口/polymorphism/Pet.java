package polymorphism;

import java.util.Scanner;

/**
 * 宠物类,定义eat,play方法
 * @author hyf
 * @date 2026/6/1
 */
public class Pet {
    protected String name;
    protected int age;
    protected String gender;
    protected int healthStatue;
    protected String[] games = {"飞盘游戏", "游泳游戏"};
    protected int intimacy;

    public Pet() {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.healthStatue = healthStatue;
        this.intimacy = intimacy;
        this.games = games;
    }

    public String getName() {
        return name;
    }

    public int getHealthStatue(){
        return healthStatue;
    }

    //实现宠物吃东西以及宠物健康值变化
    public void eat(){

    }

    //实现主人与宠物游玩以及宠物健康值和亲密度变化
    public void play(){
        Scanner input = new Scanner(System.in);
        System.out.println("请选择游戏：");
        for(int i = 0; i < games.length; i++){
            System.out.println((i+1) + "." + games[i]);
        }
        System.out.print("请输入游戏序号：");
        int gameChoice = input.nextInt();
        if(gameChoice == 1){
            healthStatue -= 5;
            intimacy += 5;
            System.out.println("正在进行飞盘游戏,游戏结束，宠物的健康值-5,亲密度+5");
        }else if(gameChoice == 2){
            healthStatue -= 5;
            intimacy += 5;
            System.out.println("正在进行游泳游戏,游戏结束，宠物的健康值-10,亲密度+10");
        }else{
            System.out.println("输入错误，请重新输入");
        }
    }

    public static void main(String[] args){
        Pet pet = new Pet();
        pet.play();
    }
}
