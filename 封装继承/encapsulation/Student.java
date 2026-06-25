package encapsulation;

/**
 * 学生类
 * @author hyf
 * @since 2026-5-30
 */
public class Student {
    public int id;
    public String name;
    public int age;
    public int score;

    // 显示学生信息
    public void showInfo() {
        System.out.println(id + "\t" + name + "\t" + age + "\t" + score);
    }
}
