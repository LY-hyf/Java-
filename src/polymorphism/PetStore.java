package polymorphism;

import java.util.Scanner;

/**
 * 宠物商店类,定义售卖宠物方法
 * @author hyf
 * @date 2026/6/1
 */
public class PetStore {
    protected static String pets[] = {"猫", "狗", "兔子","企鹅"};

    public PetStore(){
        this.pets = pets;
    }

    public String getPets(int index){
        return pets[index];
    }

    public String sellPet(){
        for(int i = 0; i < pets.length; i++){
            System.out.println((i+1) + "." + pets[i]);
        }
        System.out.print("请选择你要购买的宠物：");
        Scanner input = new Scanner(System.in);
        int petChoice = input.nextInt();
        String sellResult = pets[petChoice - 1];
        System.out.println("你成功领养了" + sellResult);
        return sellResult;
    }

}
