package polymorphism;

/**
 * 狗类,继承宠物类,重写eat方法
 * @author hyf
 * @date 2026/6/1
 */
public class Dog extends Pet{
    private String name = "狗";
    private int healthStatue;
    private int intimacy;
    public Dog(){
        super();
    }

    //实现宠物吃东西以及宠物健康值变化
    public void eat(){
        healthStatue += 4;
        System.out.println("宠物的健康值+4");
    }
}
