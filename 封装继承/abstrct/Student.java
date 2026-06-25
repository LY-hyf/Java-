package abstrct;

/**
 * 学生类,定义学生信息
 * @author hyf
 * @date 2026/6/1
 */
/**
 * 学生类（带参构造方法）
 */
public class Student {
    private String name;
    private int age;
    private String major;

    // 带参构造方法
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    // 自我介绍方法
    public void introduce() {
        System.out.println("大家好！我是" + name + "，今年" + age + "岁，就读于" + major + "专业。");
    }
}
