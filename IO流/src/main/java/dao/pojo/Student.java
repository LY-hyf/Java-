package dao.pojo;

import java.io.Serializable;

/**
 * 内部学生类，实现了 Serializable 接口用于演示对象序列化。
 * 包含姓名和年龄两个属性。
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    /**
     * 构造一个学生对象。
     * @param name 学生姓名
     * @param age  学生年龄
     */
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 返回学生的字符串表示形式。
     * @return 格式化后的学生信息字符串
     */
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
