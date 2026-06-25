package reflect;

// 示例学生类
public class Student {
    public String name;
    private int age;
    private String studentId;

    public Student() {}
    public Student(String name) { this.name = name; }
    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void study() { System.out.println(name + "正在学习"); }
    private void secret() { System.out.println("私有方法"); }
    public static void staticMethod() { System.out.println("静态方法"); }
}
