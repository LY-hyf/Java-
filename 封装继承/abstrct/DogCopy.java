package abstrct;

public class DogCopy {
    private String name = "旺财";
    private int health = 100;
    private int love = 0;

    // 定义为局部变量
    public void play(int n) {
        int localv = 5;  // 局部变量
        health = health - n;
        System.out.println(name + " " + localv + " " + health + " " + love);
    }

    public static void main(String[] args) {
        DogCopy d = new DogCopy();
        d.play(5);
    }
}
